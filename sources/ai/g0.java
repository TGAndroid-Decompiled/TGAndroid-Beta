package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.r9;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.a2;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Cells.u7;
import org.telegram.ui.Components.u81;
import org.telegram.ui.Components.uq;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.vr0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.yi;
import w7.a6;
import zh.h5;
import zh.i5;
import zh.s4;
public abstract class g0 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final p2 f442a;
    public final int f443b;
    public final f6 f444c;
    public final long d;
    public final s4 e;
    public final ArrayList f445f;
    public final ArrayList h;
    public final c f446n;
    public final u81 f447r;
    public Boolean f448s;
    public int v;
    public float f449w;
    public ValueAnimator f450x;
    public int f451y;

    public g0(Context context, p2 p2Var, long j3) {
        super(context);
        this.f445f = new ArrayList();
        this.h = new ArrayList();
        this.f448s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f451y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f442a = p2Var;
        int currentAccount = p2Var.getCurrentAccount();
        this.f443b = currentAccount;
        f6 resourceProvider = p2Var.getResourceProvider();
        this.f444c = resourceProvider;
        this.d = j3;
        setBackgroundColor(j6.v(j6.v0(j6.f17928d6, resourceProvider), j6.l1(0.04f, j6.v0(j6.G6, resourceProvider))));
        if (F == null) {
            F = new LongSparseArray();
        }
        long j10 = currentAccount;
        LongSparseArray longSparseArray = (LongSparseArray) F.get(j10);
        if (longSparseArray == null) {
            LongSparseArray longSparseArray2 = F;
            LongSparseArray longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j10, longSparseArray3);
            longSparseArray = longSparseArray3;
        }
        s4 s4Var = (s4) longSparseArray.get(j3);
        if (s4Var == null) {
            s4 s4Var2 = new s4(currentAccount, j3, "", null);
            longSparseArray.put(j3, s4Var2);
            s4Var = s4Var2;
        }
        this.e = s4Var;
        vr0 vr0Var = (vr0) this;
        c cVar = new c(vr0Var, context);
        this.f446n = cVar;
        cVar.setAllowDisallowInterceptTouch(true);
        cVar.setAdapter(new d(vr0Var, context));
        addView(cVar, a6.e(-1, -1, 119));
        u81 n10 = cVar.n(9, true);
        this.f447r = n10;
        n10.f27635r = 12;
        n10.setPreTabClick(new a1.c(vr0Var, 2));
        addView(n10, a6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        p2 p2Var = this.f442a;
        if (p2Var != null && p2Var.getParentActivity() != null) {
            yi yiVar = new yi(p2Var.getParentActivity(), this.f442a, false, false, false, this.f444c);
            yiVar.J1(1, false);
            yiVar.T0 = true;
            yiVar.S0 = false;
            yiVar.f29379j1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            yiVar.f29378j0.f0();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(p2Var.getFragmentView().findFocus());
            }
            yiVar.Z1 = new f(this, yiVar, str);
            yiVar.r1();
            yiVar.show();
        }
    }

    public final void b(String str) {
        s4 s4Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f445f;
            if (i10 < arrayList.size()) {
                s4Var = (s4) arrayList.get(i10);
                if (s4Var != null && TextUtils.equals(s4Var.E, str)) {
                    break;
                }
                i10++;
            } else {
                s4Var = null;
                break;
            }
        }
        if (s4Var != null) {
            ArrayList arrayList2 = s4Var.f48240i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f443b;
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
        this.f447r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        s4 s4Var;
        View currentView = this.f446n.getCurrentView();
        if ((currentView instanceof a0) && (s4Var = ((a0) currentView).f411a) != null) {
            ArrayList arrayList = s4Var.f48240i;
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
        c cVar = this.f446n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            s4 s4Var = this.e;
            if (obj == s4Var) {
                i(true);
                View[] viewPages = cVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof a0) {
                        a0 a0Var = (a0) view;
                        if (a0Var.f411a == s4Var) {
                            a0Var.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f445f.indexOf(obj) >= 0) {
                View[] viewPages2 = cVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof a0) {
                        a0 a0Var2 = (a0) view2;
                        if (a0Var2.f411a == objArr[0]) {
                            a0Var2.v.l();
                        }
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesUpdated) {
            i(true);
            View[] viewPages3 = cVar.getViewPages();
            int length2 = viewPages3.length;
            while (i13 < length2) {
                View view3 = viewPages3[i13];
                if (view3 instanceof a0) {
                    ((a0) view3).v.l();
                }
                i13++;
            }
        }
    }

    public abstract boolean e(MessageObject messageObject);

    public final void f() {
        s4 s4Var;
        View currentView = this.f446n.getCurrentView();
        if ((currentView instanceof a0) && (s4Var = ((a0) currentView).f411a) != null) {
            ArrayList arrayList = s4Var.f48240i;
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
        View currentView = this.f446n.getCurrentView();
        if (currentView instanceof a0) {
            s4 s4Var = ((a0) currentView).f411a;
            if (s4Var != null) {
                ArrayList arrayList = s4Var.f48240i;
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
        s4 s4Var;
        c cVar = this.f446n;
        View[] viewPages = cVar.getViewPages();
        if (Math.abs(cVar.getCurrentPosition() - cVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof a0) && (s4Var = ((a0) view).f411a) != null) {
            return s4Var.E;
        }
        return null;
    }

    public s4 getCurrentList() {
        s4 s4Var;
        View currentView = this.f446n.getCurrentView();
        if ((currentView instanceof a0) && (s4Var = ((a0) currentView).f411a) != null) {
            return s4Var;
        }
        return null;
    }

    public vl0 getCurrentListView() {
        View currentView = this.f446n.getCurrentView();
        if (currentView instanceof a0) {
            return ((a0) currentView).f414f;
        }
        return null;
    }

    public int getItemsCount() {
        s4 s4Var;
        View currentView = this.f446n.getCurrentView();
        if ((currentView instanceof a0) && (s4Var = ((a0) currentView).f411a) != null) {
            return s4Var.f48240i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        s4 s4Var;
        View currentView = this.f446n.getCurrentView();
        if ((currentView instanceof a0) && (s4Var = ((a0) currentView).f411a) != null) {
            ArrayList arrayList = s4Var.f48240i;
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
        s4 s4Var;
        r9 r9Var;
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
        i5 storiesController = MessagesController.getInstance(this.f443b).getStoriesController();
        long j3 = this.d;
        ArrayList E2 = storiesController.E(j3);
        if (E2 != null) {
            int size2 = E2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E2.get(i11);
                i11++;
                h5 h5Var = (h5) obj2;
                if (h5Var != null && (r9Var = h5Var.f48473c) != null && r9Var.J0 == j3 && !TextUtils.isEmpty(r9Var.K0) && !arrayList.contains(r9Var.K0)) {
                    arrayList.add(r9Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f445f;
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
                    if (TextUtils.equals(((s4) arrayList4.get(i13)).E, str2)) {
                        s4Var = (s4) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    s4Var = null;
                    break;
                }
            }
            if (s4Var == null) {
                s4 s4Var2 = new s4(this.f443b, this.d, str2, null);
                s4Var2.H(null);
                s4Var = s4Var2;
            }
            arrayList3.add(s4Var);
        }
        c cVar = this.f446n;
        cVar.o(true);
        SpannableString spannableString = new SpannableString(a2.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        uq uqVar = new uq(R.drawable.msg_filled_plus, 0);
        uqVar.setScale(0.9f, 0.9f);
        uqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(uqVar, 0, 1, 33);
        u81 u81Var = this.f447r;
        u81Var.a(-1, spannableString);
        u81Var.f27639x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f448s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f450x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f448s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f449w = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            u81Var.setTranslationY(AndroidUtilities.dp(f7));
            if (z11) {
                f11 = 42.0f;
            }
            cVar.setTranslationY(AndroidUtilities.dp(f11));
            return;
        }
        float f12 = this.f449w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f450x = ofFloat;
        ofFloat.addUpdateListener(new a(this, 0));
        this.f450x.addListener(new e(0, this, z11));
        this.f450x.setDuration(320L);
        this.f450x.setInterpolator(wr.h);
        this.f450x.start();
    }

    public final void j() {
        View currentView = this.f446n.getCurrentView();
        if (currentView instanceof a0) {
            a0 a0Var = (a0) currentView;
            o oVar = a0Var.f414f;
            for (int i10 = 0; i10 < oVar.getChildCount(); i10++) {
                View childAt = oVar.getChildAt(i10);
                if (childAt instanceof u7) {
                    u7 u7Var = (u7) childAt;
                    u7Var.i(a0Var.W.c(u7Var.getMessageObject()), true);
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
        int i10 = this.f443b;
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
        int i10 = this.f443b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f446n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof a0) {
                    ((a0) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
