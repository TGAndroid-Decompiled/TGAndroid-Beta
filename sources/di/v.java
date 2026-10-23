package di;

import ah.c0;
import ah.p0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import ci.g7;
import ci.h7;
import ci.s6;
import ei.a8;
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
import org.telegram.messenger.v0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.k91;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.xq;
import w7.z5;
public abstract class v extends FrameLayout implements b6, NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final o2 f8075a;
    public final int f8076b;
    public final g6 f8077c;
    public final long d;
    public final s6 e;
    public final ArrayList f8078f;
    public final ArrayList h;
    public final a f8079n;
    public final k91 f8080r;
    public Boolean f8081s;
    public int v;
    public float f8082w;
    public ValueAnimator f8083x;
    public int f8084y;

    public v(Context context, o2 o2Var, long j10) {
        super(context);
        this.f8078f = new ArrayList();
        this.h = new ArrayList();
        this.f8081s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f8084y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f8075a = o2Var;
        int currentAccount = o2Var.getCurrentAccount();
        this.f8076b = currentAccount;
        g6 resourceProvider = o2Var.getResourceProvider();
        this.f8077c = resourceProvider;
        this.d = j10;
        setBackgroundColor(k6.v(k6.w0(k6.f21183d6, resourceProvider), k6.o1(0.04f, k6.w0(k6.G6, resourceProvider))));
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
        ms0 ms0Var = (ms0) this;
        a aVar = new a(ms0Var, context);
        this.f8079n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(ms0Var, context));
        addView(aVar, z5.e(-1, -1, 119));
        k91 n10 = aVar.n(9, true);
        this.f8080r = n10;
        n10.f27981r = 12;
        n10.setPreTabClick(new a1.c(ms0Var, 28));
        addView(n10, z5.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        o2 o2Var = this.f8075a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            ti tiVar = new ti(o2Var.getParentActivity(), this.f8075a, false, false, false, this.f8077c);
            tiVar.R1(1, false);
            tiVar.W0 = true;
            tiVar.V0 = false;
            tiVar.f30750m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            tiVar.f30742j0.f0();
            tiVar.f30722c2 = new c(this, tiVar, str);
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
            ArrayList arrayList = this.f8078f;
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
            ArrayList arrayList2 = s6Var.f6193i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f8076b;
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
        this.f8080r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        s6 s6Var;
        View currentView = this.f8079n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f8061a) != null) {
            ArrayList arrayList = s6Var.f6193i;
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
        a aVar = this.f8079n;
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
                        if (rVar.f8061a == s6Var) {
                            rVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f8078f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof r) {
                        r rVar2 = (r) view2;
                        if (rVar2.f8061a == objArr[0]) {
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
        View currentView = this.f8079n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f8061a) != null) {
            ArrayList arrayList = s6Var.f6193i;
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
        View currentView = this.f8079n.getCurrentView();
        if (currentView instanceof r) {
            s6 s6Var = ((r) currentView).f8061a;
            if (s6Var != null) {
                ArrayList arrayList = s6Var.f6193i;
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
        a aVar = this.f8079n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof r) && (s6Var = ((r) view).f8061a) != null) {
            return s6Var.E;
        }
        return null;
    }

    public s6 getCurrentList() {
        s6 s6Var;
        View currentView = this.f8079n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f8061a) != null) {
            return s6Var;
        }
        return null;
    }

    public mm0 getCurrentListView() {
        View currentView = this.f8079n.getCurrentView();
        if (currentView instanceof r) {
            return ((r) currentView).f8064f;
        }
        return null;
    }

    public int getItemsCount() {
        s6 s6Var;
        View currentView = this.f8079n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f8061a) != null) {
            return s6Var.f6193i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        s6 s6Var;
        View currentView = this.f8079n.getCurrentView();
        if ((currentView instanceof r) && (s6Var = ((r) currentView).f8061a) != null) {
            ArrayList arrayList = s6Var.f6193i;
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
        a8 a8Var;
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
        h7 storiesController = MessagesController.getInstance(this.f8076b).getStoriesController();
        long j10 = this.d;
        ArrayList E2 = storiesController.E(j10);
        if (E2 != null) {
            int size2 = E2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E2.get(i11);
                i11++;
                g7 g7Var = (g7) obj2;
                if (g7Var != null && (a8Var = g7Var.f5366c) != null && a8Var.J0 == j10 && !TextUtils.isEmpty(a8Var.K0) && !arrayList.contains(a8Var.K0)) {
                    arrayList.add(a8Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f8078f;
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
                s6 s6Var2 = new s6(this.f8076b, this.d, str2, null);
                s6Var2.H(null);
                s6Var = s6Var2;
            }
            arrayList3.add(s6Var);
        }
        a aVar = this.f8079n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(v0.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        xq xqVar = new xq(R.drawable.msg_filled_plus, 0);
        xqVar.setScale(0.9f, 0.9f);
        xqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(xqVar, 0, 1, 33);
        k91 k91Var = this.f8080r;
        k91Var.a(-1, spannableString);
        k91Var.f27985x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f8081s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f8083x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f8081s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f8082w = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            k91Var.setTranslationY(AndroidUtilities.dp(f7));
            if (z11) {
                f11 = 42.0f;
            }
            aVar.setTranslationY(AndroidUtilities.dp(f11));
            return;
        }
        float f12 = this.f8082w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f8083x = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 22));
        this.f8083x.addListener(new p0(5, this, z11));
        this.f8083x.setDuration(320L);
        this.f8083x.setInterpolator(bs.h);
        this.f8083x.start();
    }

    public final void j() {
        View currentView = this.f8079n.getCurrentView();
        if (currentView instanceof r) {
            r rVar = (r) currentView;
            i iVar = rVar.f8064f;
            for (int i10 = 0; i10 < iVar.getChildCount(); i10++) {
                View childAt = iVar.getChildAt(i10);
                if (childAt instanceof s7) {
                    s7 s7Var = (s7) childAt;
                    s7Var.i(rVar.W.c(s7Var.getMessageObject()), true);
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
        int i10 = this.f8076b;
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
        int i10 = this.f8076b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f8079n.getViewPages();
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
        g6 g6Var = this.f8077c;
        try {
            setBackgroundColor(k6.v(k6.w0(k6.f21183d6, g6Var), k6.o1(0.04f, k6.w0(k6.G6, g6Var))));
            invalidate();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
