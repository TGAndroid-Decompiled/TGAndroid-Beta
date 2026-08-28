package jh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import g7.e6;
import gh.i3;
import hg.b0;
import ih.f6;
import ih.u6;
import ih.v6;
import java.util.ArrayList;
import kh.a8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.l0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Cells.r7;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.uq0;
import org.telegram.ui.Components.wk0;
public abstract class u extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray A;
    public static LongSparseArray B;
    public final o2 f14378a;
    public final int f14379b;
    public final b6 f14380c;
    public final long d;
    public final f6 f14381e;
    public final ArrayList f14382f;
    public final ArrayList h;
    public final a f14383n;
    public final m71 f14384r;
    public Boolean f14385s;
    public int v;
    public float f14386w;
    public ValueAnimator f14387x;
    public int f14388y;

    public u(Context context, o2 o2Var, long j10) {
        super(context);
        this.f14382f = new ArrayList();
        this.h = new ArrayList();
        this.f14385s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f14388y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f14378a = o2Var;
        int currentAccount = o2Var.getCurrentAccount();
        this.f14379b = currentAccount;
        b6 resourceProvider = o2Var.getResourceProvider();
        this.f14380c = resourceProvider;
        this.d = j10;
        setBackgroundColor(org.telegram.ui.ActionBar.f6.v(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, resourceProvider), org.telegram.ui.ActionBar.f6.l1(0.04f, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.G6, resourceProvider))));
        if (B == null) {
            B = new LongSparseArray();
        }
        long j11 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) B.get(j11);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = B;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j11, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        f6 f6Var = (f6) longSparseArray.get(j10);
        if (f6Var == null) {
            f6 f6Var2 = new f6(currentAccount, j10, "", null);
            longSparseArray.put(j10, f6Var2);
            f6Var = f6Var2;
        }
        this.f14381e = f6Var;
        uq0 uq0Var = (uq0) this;
        a aVar = new a(uq0Var, context);
        this.f14383n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(uq0Var, context));
        addView(aVar, e6.e(-1, -1, 119));
        m71 n10 = aVar.n(9, true);
        this.f14384r = n10;
        n10.f30755r = 12;
        n10.setPreTabClick(new i3(uq0Var, 28));
        addView(n10, e6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        o2 o2Var = this.f14378a;
        if (o2Var != null && o2Var.getParentActivity() != null) {
            ki kiVar = new ki(o2Var.getParentActivity(), this.f14378a, false, false, false, this.f14380c);
            kiVar.J1(1, false);
            kiVar.P0 = true;
            kiVar.O0 = false;
            kiVar.f30115f1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            kiVar.f30114f0.e0();
            int i9 = Build.VERSION.SDK_INT;
            if (i9 == 21 || i9 == 22) {
                AndroidUtilities.hideKeyboard(o2Var.getFragmentView().findFocus());
            }
            kiVar.V1 = new c(this, kiVar, str);
            kiVar.r1();
            kiVar.show();
        }
    }

    public final void b(String str) {
        f6 f6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f14381e.G.remove(str);
        this.h.remove(str);
        int i9 = 0;
        while (true) {
            ArrayList arrayList = this.f14382f;
            if (i9 < arrayList.size()) {
                f6Var = (f6) arrayList.get(i9);
                if (f6Var != null && TextUtils.equals(f6Var.E, str)) {
                    break;
                }
                i9++;
            } else {
                f6Var = null;
                break;
            }
        }
        if (f6Var != null) {
            ArrayList arrayList2 = f6Var.f11851i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i10 = this.f14379b;
            deletepreviewmedia.bot = MessagesController.getInstance(i10).getInputUser(this.d);
            deletepreviewmedia.lang_code = str;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                TL_stories.StoryItem storyItem = ((MessageObject) arrayList2.get(i11)).storyItem;
                if (storyItem != null && (messageMedia = storyItem.media) != null) {
                    deletepreviewmedia.media.add(MessagesController.toInputMedia(messageMedia));
                }
            }
            ConnectionsManager.getInstance(i10).sendRequest(deletepreviewmedia, null);
        }
        i(true);
        this.f14384r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        f6 f6Var;
        View currentView = this.f14383n.getCurrentView();
        if ((currentView instanceof q) && (f6Var = ((q) currentView).f14363a) != null) {
            ArrayList arrayList = f6Var.f11851i;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (!c((MessageObject) arrayList.get(i9))) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        int i11 = NotificationCenter.storiesListUpdated;
        a aVar = this.f14383n;
        int i12 = 0;
        if (i9 == i11) {
            Object obj = objArr[0];
            f6 f6Var = this.f14381e;
            if (obj == f6Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i12 < length) {
                    View view = viewPages[i12];
                    if (view instanceof q) {
                        q qVar = (q) view;
                        if (qVar.f14363a == f6Var) {
                            qVar.v.l();
                        }
                    }
                    i12++;
                }
            } else if (this.f14382f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof q) {
                        q qVar2 = (q) view2;
                        if (qVar2.f14363a == objArr[0]) {
                            qVar2.v.l();
                        }
                    }
                }
            }
        } else if (i9 == NotificationCenter.storiesUpdated) {
            i(true);
            View[] viewPages3 = aVar.getViewPages();
            int length2 = viewPages3.length;
            while (i12 < length2) {
                View view3 = viewPages3[i12];
                if (view3 instanceof q) {
                    ((q) view3).v.l();
                }
                i12++;
            }
        }
    }

    public abstract boolean e(MessageObject messageObject);

    public final void f() {
        f6 f6Var;
        View currentView = this.f14383n.getCurrentView();
        if ((currentView instanceof q) && (f6Var = ((q) currentView).f14363a) != null) {
            ArrayList arrayList = f6Var.f11851i;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (!c((MessageObject) arrayList.get(i9))) {
                    e((MessageObject) arrayList.get(i9));
                }
            }
        }
    }

    public abstract boolean g(MessageObject messageObject);

    public String getBotPreviewsSubtitle() {
        int i9;
        int i10;
        TLRPC.MessageMedia messageMedia;
        StringBuilder sb2 = new StringBuilder();
        View currentView = this.f14383n.getCurrentView();
        if (currentView instanceof q) {
            f6 f6Var = ((q) currentView).f14363a;
            if (f6Var != null) {
                ArrayList arrayList = f6Var.f11851i;
                i9 = 0;
                i10 = 0;
                for (int i11 = 0; i11 < arrayList.size(); i11++) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i11);
                    TL_stories.StoryItem storyItem = messageObject.storyItem;
                    if (storyItem != null && (messageMedia = storyItem.media) != null) {
                        if (MessageObject.isVideoDocument(messageMedia.document)) {
                            i10++;
                        } else if (messageObject.storyItem.media.photo != null) {
                            i9++;
                        }
                    }
                }
            } else {
                i9 = 0;
                i10 = 0;
            }
            if (i9 == 0 && i10 == 0) {
                return LocaleController.getString(R.string.BotPreviewEmpty);
            }
            if (i9 > 0) {
                sb2.append(LocaleController.formatPluralString("Images", i9, new Object[0]));
            }
            if (i10 > 0) {
                if (sb2.length() > 0) {
                    sb2.append(", ");
                }
                sb2.append(LocaleController.formatPluralString("Videos", i10, new Object[0]));
            }
        }
        return sb2.toString();
    }

    public String getCurrentLang() {
        View view;
        f6 f6Var;
        a aVar = this.f14383n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof q) && (f6Var = ((q) view).f14363a) != null) {
            return f6Var.E;
        }
        return null;
    }

    public f6 getCurrentList() {
        f6 f6Var;
        View currentView = this.f14383n.getCurrentView();
        if ((currentView instanceof q) && (f6Var = ((q) currentView).f14363a) != null) {
            return f6Var;
        }
        return null;
    }

    public wk0 getCurrentListView() {
        View currentView = this.f14383n.getCurrentView();
        if (currentView instanceof q) {
            return ((q) currentView).f14367f;
        }
        return null;
    }

    public int getItemsCount() {
        f6 f6Var;
        View currentView = this.f14383n.getCurrentView();
        if ((currentView instanceof q) && (f6Var = ((q) currentView).f14363a) != null) {
            return f6Var.f11851i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        f6 f6Var;
        View currentView = this.f14383n.getCurrentView();
        if ((currentView instanceof q) && (f6Var = ((q) currentView).f14363a) != null) {
            ArrayList arrayList = f6Var.f11851i;
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                if (c((MessageObject) arrayList.get(i9))) {
                    g((MessageObject) arrayList.get(i9));
                }
            }
        }
    }

    public final void i(boolean z10) {
        boolean z11;
        float f10;
        f6 f6Var;
        a8 a8Var;
        ArrayList arrayList = new ArrayList(this.f14381e.G);
        ArrayList arrayList2 = this.h;
        int size = arrayList2.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList2.get(i9);
            i9++;
            String str = (String) obj;
            if (!arrayList.contains(str)) {
                arrayList.add(str);
            }
        }
        v6 storiesController = MessagesController.getInstance(this.f14379b).getStoriesController();
        long j10 = this.d;
        ArrayList E = storiesController.E(j10);
        if (E != null) {
            int size2 = E.size();
            int i10 = 0;
            while (i10 < size2) {
                Object obj2 = E.get(i10);
                i10++;
                u6 u6Var = (u6) obj2;
                if (u6Var != null && (a8Var = u6Var.f12193c) != null && a8Var.J0 == j10 && !TextUtils.isEmpty(a8Var.K0) && !arrayList.contains(a8Var.K0)) {
                    arrayList.add(a8Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f14382f;
        ArrayList arrayList4 = new ArrayList(arrayList3);
        arrayList3.clear();
        int size3 = arrayList.size();
        int i11 = 0;
        while (i11 < size3) {
            Object obj3 = arrayList.get(i11);
            i11++;
            String str2 = (String) obj3;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList4.size()) {
                    if (TextUtils.equals(((f6) arrayList4.get(i12)).E, str2)) {
                        f6Var = (f6) arrayList4.get(i12);
                        break;
                    }
                    i12++;
                } else {
                    f6Var = null;
                    break;
                }
            }
            if (f6Var == null) {
                f6 f6Var2 = new f6(this.f14379b, this.d, str2, null);
                f6Var2.H(null);
                f6Var = f6Var2;
            }
            arrayList3.add(f6Var);
        }
        a aVar = this.f14383n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(l0.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        eq eqVar = new eq(R.drawable.msg_filled_plus, 0);
        eqVar.setScale(0.9f, 0.9f);
        eqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(eqVar, 0, 1, 33);
        m71 m71Var = this.f14384r;
        m71Var.a(-1, spannableString);
        m71Var.f30758x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f14385s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f14387x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f14385s = Boolean.valueOf(z11);
        float f11 = 1.0f;
        float f12 = 0.0f;
        if (!z10) {
            if (!z11) {
                f11 = 0.0f;
            }
            this.f14386w = f11;
            if (z11) {
                f10 = 0.0f;
            } else {
                f10 = -42.0f;
            }
            m71Var.setTranslationY(AndroidUtilities.dp(f10));
            if (z11) {
                f12 = 42.0f;
            }
            aVar.setTranslationY(AndroidUtilities.dp(f12));
            return;
        }
        float f13 = this.f14386w;
        if (!z11) {
            f11 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f13, f11);
        this.f14387x = ofFloat;
        ofFloat.addUpdateListener(new bg.b(this, 24));
        this.f14387x.addListener(new b0(5, this, z11));
        this.f14387x.setDuration(320L);
        this.f14387x.setInterpolator(gr.h);
        this.f14387x.start();
    }

    public final void j() {
        View currentView = this.f14383n.getCurrentView();
        if (currentView instanceof q) {
            q qVar = (q) currentView;
            i iVar = qVar.f14367f;
            for (int i9 = 0; i9 < iVar.getChildCount(); i9++) {
                View childAt = iVar.getChildAt(i9);
                if (childAt instanceof r7) {
                    r7 r7Var = (r7) childAt;
                    r7Var.i(qVar.S.c(r7Var.getMessageObject()), true);
                }
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (A == null) {
            A = new LongSparseArray();
        }
        LongSparseArray longSparseArray = A;
        int i9 = this.f14379b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i9);
        if (longSparseArray2 == null) {
            LongSparseArray longSparseArray3 = new LongSparseArray();
            A.put(i9, longSparseArray3);
            longSparseArray2 = longSparseArray3;
        }
        longSparseArray2.put(this.d, this);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9).addObserver(this, NotificationCenter.storiesUpdated);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (A == null) {
            A = new LongSparseArray();
        }
        LongSparseArray longSparseArray = A;
        int i9 = this.f14379b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i9);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i9).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i9) {
        this.v = i9;
        View[] viewPages = this.f14383n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof q) {
                    ((q) view).setVisibleHeight(i9);
                }
            }
        }
    }
}
