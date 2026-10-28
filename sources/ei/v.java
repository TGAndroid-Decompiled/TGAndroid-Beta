package ei;

import ai.g0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bh.f0;
import di.g7;
import di.h7;
import di.s6;
import fi.w7;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.u91;
import org.telegram.ui.Components.vs0;
import org.telegram.ui.Components.zq;
public abstract class v extends FrameLayout implements p6, NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final r2 f10014a;
    public final int f10015b;
    public final u6 f10016c;
    public final long d;
    public final s6 e;
    public final ArrayList f10017f;
    public final ArrayList h;
    public final a f10018n;
    public final u91 f10019r;
    public Boolean f10020s;
    public int v;
    public float f10021w;
    public ValueAnimator f10022x;
    public int f10023y;

    public v(Context context, r2 r2Var, long j10) {
        super(context);
        this.f10017f = new ArrayList();
        this.h = new ArrayList();
        this.f10020s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f10023y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f10014a = r2Var;
        int currentAccount = r2Var.getCurrentAccount();
        this.f10015b = currentAccount;
        u6 resourceProvider = r2Var.getResourceProvider();
        this.f10016c = resourceProvider;
        this.d = j10;
        setBackgroundColor(y6.v(y6.w0(y6.f23357d6, resourceProvider), y6.o1(0.04f, y6.w0(y6.G6, resourceProvider))));
        if (F == null) {
            F = new LongSparseArray();
        }
        long j11 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) F.get(j11);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = F;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        s6 s6Var = (s6) longSparseArray.get(j10);
        if (s6Var == null) {
            s6 s6Var2 = new s6(currentAccount, j10, "", null);
            longSparseArray.put(j10, s6Var2);
            s6Var = s6Var2;
        }
        this.e = s6Var;
        vs0 vs0Var = (vs0) this;
        a aVar = new a(vs0Var, context);
        this.f10018n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(vs0Var, context));
        addView(aVar, kb1.i(-1, -1, 119));
        u91 n10 = aVar.n(9, true);
        this.f10019r = n10;
        n10.f33317r = 12;
        n10.setPreTabClick(new e1.c(vs0Var, 1));
        addView(n10, kb1.i(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        r2 r2Var = this.f10014a;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            ti tiVar = new ti(r2Var.getParentActivity(), this.f10014a, false, false, false, this.f10016c);
            tiVar.R1(1, false);
            tiVar.W0 = true;
            tiVar.V0 = false;
            tiVar.f33010m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            tiVar.f33002j0.g0();
            tiVar.f32982c2 = new c(this, tiVar, str);
            tiVar.w1();
            tiVar.show();
        }
    }

    public final void b(String str) {
        s6 s6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f10017f;
            if (i10 < arrayList.size()) {
                s6Var = (s6) arrayList.get(i10);
                if (s6Var != null && TextUtils.equals(s6Var.E, str)) {
                    break;
                }
                i10++;
            } else {
                s6Var = null;
                break;
            }
        }
        if (s6Var != null) {
            ArrayList arrayList2 = s6Var.f9492i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f10015b;
            deletepreviewmedia.bot = MessagesController.getInstance(i11).getInputUser(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList2.get(i12)).storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(MessagesController.toInputMedia(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i11).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f10019r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        s6 s6Var;
        View currentView = this.f10018n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10000a) != null) {
            ArrayList arrayList = s6Var.f9492i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!c((MessageObject) arrayList.get(i10))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.storiesListUpdated;
        a aVar = this.f10018n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            s6 s6Var = this.e;
            if (obj == s6Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof r) {
                        r rVar = (r) view;
                        if (rVar.f10000a == s6Var) {
                            rVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f10017f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof r) {
                        r rVar2 = (r) view2;
                        if (rVar2.f10000a == objArr[0]) {
                            rVar2.v.l();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            i(true);
            View[] viewPages3 = aVar.getViewPages();
            int length2 = viewPages3.length;
            while (i13 < length2) {
                View view3 = viewPages3[i13];
                if (view3 instanceof r) {
                    ((r) view3).v.l();
                }
                i13++;
            }
        }
    }

    public abstract boolean e(MessageObject messageObject);

    public final void f() {
        s6 s6Var;
        View currentView = this.f10018n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10000a) != null) {
            ArrayList arrayList = s6Var.f9492i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (!c((MessageObject) arrayList.get(i10))) {
                    e((MessageObject) arrayList.get(i10));
                }
            }
        }
    }

    public abstract boolean g(MessageObject messageObject);

    public String getBotPreviewsSubtitle() {
        int i10;
        int i11;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.f10018n.getCurrentView();
        if (currentView instanceof r) {
            s6 s6Var = ((r) currentView).f10000a;
            if (s6Var != null) {
                ArrayList arrayList = s6Var.f9492i;
                i10 = 0;
                i11 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i12);
                    TL_stories.StoryItem storyItem = messageObject.storyItem;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (MessageObject.isVideoDocument(messageMedia.document)) {
                            i11++;
                        } else if (messageObject.storyItem.media.photo != null) {
                            i10++;
                        }
                    }
                }
            } else {
                i10 = 0;
                i11 = 0;
            }
            if (i10 == 0 && i11 == 0) {
                return LocaleController.getString(R.string.BotPreviewEmpty);
            }
            if (i10 > 0) {
                sb2.append(LocaleController.formatPluralString("Images", i10, new Object[0]));
            }
            if (i11 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(LocaleController.formatPluralString("Videos", i11, new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        s6 s6Var;
        a aVar = this.f10018n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof r) && (s6Var = ((r) view).f10000a) != null) {
            return s6Var.E;
        }
        return null;
    }

    public s6 getCurrentList() {
        s6 s6Var;
        View currentView = this.f10018n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10000a) != null) {
            return s6Var;
        }
        return null;
    }

    public nm0 getCurrentListView() {
        View currentView = this.f10018n.getCurrentView();
        if (currentView instanceof r) {
            return ((r) currentView).f10003f;
        }
        return null;
    }

    public int getItemsCount() {
        s6 s6Var;
        View currentView = this.f10018n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10000a) != null) {
            return s6Var.f9492i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        s6 s6Var;
        View currentView = this.f10018n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10000a) != null) {
            ArrayList arrayList = s6Var.f9492i;
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                if (c((MessageObject) arrayList.get(i10))) {
                    g((MessageObject) arrayList.get(i10));
                }
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        float f7;
        s6 s6Var;
        w7 w7Var;
        ArrayList arrayList = new ArrayList(this.e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        h7 storiesController = MessagesController.getInstance(this.f10015b).getStoriesController();
        long j10 = this.d;
        ArrayList F2 = storiesController.F(j10);
        if (F2 != null) {
            int size2 = F2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = F2.get(i11);
                i11++;
                g7 g7Var = (g7) obj2;
                if (g7Var != null && (w7Var = g7Var.f8584c) != null && w7Var.J0 == j10 && !TextUtils.isEmpty(w7Var.K0) && !arrayList.contains(w7Var.K0)) {
                    arrayList.add(w7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f10017f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i12 = 0;
        while (i12 < size3) {
            Object obj3 = arrayList.get(i12);
            i12++;
            String str2 = (String) obj3;
            int i13 = 0;
            while (true) {
                if (i13 < arrayList4.size()) {
                    if (TextUtils.equals(((s6) arrayList4.get(i13)).E, str2)) {
                        s6Var = (s6) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    s6Var = null;
                    break;
                }
            }
            if (s6Var == null) {
                s6 s6Var2 = new s6(this.f10015b, this.d, str2, null);
                s6Var2.H(null);
                s6Var = s6Var2;
            }
            arrayList3.add(s6Var);
        }
        a aVar = this.f10018n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(org.telegram.messenger.t.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        zq zqVar = new zq(R.drawable.msg_filled_plus, 0);
        zqVar.setScale(0.9f, 0.9f);
        zqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(zqVar, 0, 1, 33);
        u91 u91Var = this.f10019r;
        u91Var.a(-1, spannableString);
        u91Var.f33321x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f10020s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f10022x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f10020s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f10021w = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            u91Var.setTranslationY(AndroidUtilities.dp(f7));
            if (z11) {
                f11 = 42.0f;
            }
            aVar.setTranslationY(AndroidUtilities.dp(f11));
            return;
        }
        float f12 = this.f10021w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f10022x = ofFloat;
        ofFloat.addUpdateListener(new g0(this, 24));
        this.f10022x.addListener(new f0(5, this, z11));
        this.f10022x.setDuration(320L);
        this.f10022x.setInterpolator(ds.h);
        this.f10022x.start();
    }

    public final void j() {
        View currentView = this.f10018n.getCurrentView();
        if (currentView instanceof r) {
            r rVar = (r) currentView;
            i iVar = rVar.f10003f;
            for (int i10 = 0; i10 < iVar.getChildCount(); i10++) {
                View childAt = iVar.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.w7) {
                    org.telegram.ui.Cells.w7 w7Var = (org.telegram.ui.Cells.w7) childAt;
                    w7Var.i(rVar.W.c(w7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i10 = this.f10015b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = new LongSparseArray();
            E.put(i10, longSparseArray3);
            longSparseArray2 = longSparseArray3;
        }
        longSparseArray2.put(this.d, this);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).addWeakObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i10 = this.f10015b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f10018n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof r) {
                    ((r) view).setVisibleHeight(i10);
                }
            }
        }
    }

    @Override
    public final void updateColors() {
        u6 u6Var = this.f10016c;
        try {
            setBackgroundColor(y6.v(y6.w0(y6.f23357d6, u6Var), y6.o1(0.04f, y6.w0(y6.G6, u6Var))));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
