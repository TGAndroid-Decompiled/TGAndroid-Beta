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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.us0;
import org.telegram.ui.Components.zq;
public abstract class v extends FrameLayout implements p6, NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final r2 f10015a;
    public final int f10016b;
    public final u6 f10017c;
    public final long d;
    public final s6 e;
    public final ArrayList f10018f;
    public final ArrayList h;
    public final a f10019n;
    public final t91 f10020r;
    public Boolean f10021s;
    public int v;
    public float f10022w;
    public ValueAnimator f10023x;
    public int f10024y;

    public v(Context context, r2 r2Var, long j10) {
        super(context);
        this.f10018f = new ArrayList();
        this.h = new ArrayList();
        this.f10021s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f10024y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f10015a = r2Var;
        int currentAccount = r2Var.getCurrentAccount();
        this.f10016b = currentAccount;
        u6 resourceProvider = r2Var.getResourceProvider();
        this.f10017c = resourceProvider;
        this.d = j10;
        setBackgroundColor(y6.v(y6.w0(y6.f23354d6, resourceProvider), y6.o1(0.04f, y6.w0(y6.G6, resourceProvider))));
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
        us0 us0Var = (us0) this;
        a aVar = new a(us0Var, context);
        this.f10019n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(us0Var, context));
        addView(aVar, gb1.i(-1, -1, 119));
        t91 n10 = aVar.n(9, true);
        this.f10020r = n10;
        n10.f32940r = 12;
        n10.setPreTabClick(new e1.c(us0Var, 1));
        addView(n10, gb1.i(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        r2 r2Var = this.f10015a;
        if (r2Var != null && r2Var.getParentActivity() != null) {
            ti tiVar = new ti(r2Var.getParentActivity(), this.f10015a, false, false, false, this.f10017c);
            tiVar.Q1(1, false);
            tiVar.W0 = true;
            tiVar.V0 = false;
            tiVar.f33038m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            tiVar.f33030j0.f0();
            tiVar.f33010c2 = new c(this, tiVar, str);
            tiVar.v1();
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
            ArrayList arrayList = this.f10018f;
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
            ArrayList arrayList2 = s6Var.f9493i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f10016b;
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
        this.f10020r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        s6 s6Var;
        View currentView = this.f10019n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10001a) != null) {
            ArrayList arrayList = s6Var.f9493i;
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
        a aVar = this.f10019n;
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
                        if (rVar.f10001a == s6Var) {
                            rVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f10018f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof r) {
                        r rVar2 = (r) view2;
                        if (rVar2.f10001a == objArr[0]) {
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
        View currentView = this.f10019n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10001a) != null) {
            ArrayList arrayList = s6Var.f9493i;
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
        View currentView = this.f10019n.getCurrentView();
        if (currentView instanceof r) {
            s6 s6Var = ((r) currentView).f10001a;
            if (s6Var != null) {
                ArrayList arrayList = s6Var.f9493i;
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
        a aVar = this.f10019n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof r) && (s6Var = ((r) view).f10001a) != null) {
            return s6Var.E;
        }
        return null;
    }

    public s6 getCurrentList() {
        s6 s6Var;
        View currentView = this.f10019n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10001a) != null) {
            return s6Var;
        }
        return null;
    }

    public mm0 getCurrentListView() {
        View currentView = this.f10019n.getCurrentView();
        if (currentView instanceof r) {
            return ((r) currentView).f10004f;
        }
        return null;
    }

    public int getItemsCount() {
        s6 s6Var;
        View currentView = this.f10019n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10001a) != null) {
            return s6Var.f9493i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        s6 s6Var;
        View currentView = this.f10019n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f10001a) != null) {
            ArrayList arrayList = s6Var.f9493i;
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
        h7 storiesController = MessagesController.getInstance(this.f10016b).getStoriesController();
        long j10 = this.d;
        ArrayList E2 = storiesController.E(j10);
        if (E2 != null) {
            int size2 = E2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E2.get(i11);
                i11++;
                g7 g7Var = (g7) obj2;
                if (g7Var != null && (w7Var = g7Var.f8585c) != null && w7Var.J0 == j10 && !TextUtils.isEmpty(w7Var.K0) && !arrayList.contains(w7Var.K0)) {
                    arrayList.add(w7Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f10018f;
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
                s6 s6Var2 = new s6(this.f10016b, this.d, str2, null);
                s6Var2.H(null);
                s6Var = s6Var2;
            }
            arrayList3.add(s6Var);
        }
        a aVar = this.f10019n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(org.telegram.messenger.t.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        zq zqVar = new zq(R.drawable.msg_filled_plus, 0);
        zqVar.setScale(0.9f, 0.9f);
        zqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(zqVar, 0, 1, 33);
        t91 t91Var = this.f10020r;
        t91Var.a(-1, spannableString);
        t91Var.f32944x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f10021s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f10023x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f10021s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f10022w = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            t91Var.setTranslationY(AndroidUtilities.dp(f7));
            if (z11) {
                f11 = 42.0f;
            }
            aVar.setTranslationY(AndroidUtilities.dp(f11));
            return;
        }
        float f12 = this.f10022w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f10023x = ofFloat;
        ofFloat.addUpdateListener(new g0(this, 24));
        this.f10023x.addListener(new f0(5, this, z11));
        this.f10023x.setDuration(320L);
        this.f10023x.setInterpolator(ds.h);
        this.f10023x.start();
    }

    public final void j() {
        View currentView = this.f10019n.getCurrentView();
        if (currentView instanceof r) {
            r rVar = (r) currentView;
            i iVar = rVar.f10004f;
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
        int i10 = this.f10016b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = new LongSparseArray();
            E.put(i10, longSparseArray3);
            longSparseArray2 = longSparseArray3;
        }
        longSparseArray2.put(this.d, this);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (E == null) {
            E = new LongSparseArray();
        }
        LongSparseArray longSparseArray = E;
        int i10 = this.f10016b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f10019n.getViewPages();
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
        u6 u6Var = this.f10017c;
        try {
            setBackgroundColor(y6.v(y6.w0(y6.f23354d6, u6Var), y6.o1(0.04f, y6.w0(y6.G6, u6Var))));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
