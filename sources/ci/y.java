package ci;

import ah.d0;
import ah.q0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Build;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.b8;
import bi.t8;
import bi.u8;
import di.o8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.w1;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.vi;
import w7.x5;
public abstract class y extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final n2 f4875a;
    public final int f4876b;
    public final f6 f4877c;
    public final long d;
    public final b8 f4878e;
    public final ArrayList f4879f;
    public final ArrayList h;
    public final a f4880n;
    public final h81 f4881r;
    public Boolean f4882s;
    public int v;
    public float f4883w;
    public ValueAnimator f4884x;
    public int f4885y;

    public y(Context context, n2 n2Var, long j3) {
        super(context);
        this.f4879f = new ArrayList();
        this.h = new ArrayList();
        this.f4882s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f4885y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f4875a = n2Var;
        int currentAccount = n2Var.getCurrentAccount();
        this.f4876b = currentAccount;
        f6 resourceProvider = n2Var.getResourceProvider();
        this.f4877c = resourceProvider;
        this.d = j3;
        setBackgroundColor(j6.v(j6.v0(j6.f20690d6, resourceProvider), j6.l1(0.04f, j6.v0(j6.G6, resourceProvider))));
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
        b8 b8Var = (b8) longSparseArray.get(j3);
        if (b8Var == null) {
            b8 b8Var2 = new b8(currentAccount, j3, "", null);
            longSparseArray.put(j3, b8Var2);
            b8Var = b8Var2;
        }
        this.f4878e = b8Var;
        lr0 lr0Var = (lr0) this;
        a aVar = new a(lr0Var, context);
        this.f4880n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(lr0Var, context));
        addView(aVar, x5.e(-1, -1, 119));
        h81 n10 = aVar.n(9, true);
        this.f4881r = n10;
        n10.f26681r = 12;
        n10.setPreTabClick(new a1.c(lr0Var, 12));
        addView(n10, x5.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        n2 n2Var = this.f4875a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            vi viVar = new vi(n2Var.getParentActivity(), this.f4875a, false, false, false, this.f4877c);
            viVar.J1(1, false);
            viVar.T0 = true;
            viVar.S0 = false;
            viVar.f31319j1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            viVar.f31318j0.f0();
            int i10 = Build.VERSION.SDK_INT;
            if (i10 == 21 || i10 == 22) {
                AndroidUtilities.hideKeyboard(n2Var.getFragmentView().findFocus());
            }
            viVar.Z1 = new c(this, viVar, str);
            viVar.r1();
            viVar.show();
        }
    }

    public final void b(String str) {
        b8 b8Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f4878e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4879f;
            if (i10 < arrayList.size()) {
                b8Var = (b8) arrayList.get(i10);
                if (b8Var != null && TextUtils.equals(b8Var.E, str)) {
                    break;
                }
                i10++;
            } else {
                b8Var = null;
                break;
            }
        }
        if (b8Var != null) {
            ArrayList arrayList2 = b8Var.f3302i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f4876b;
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
        this.f4881r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        b8 b8Var;
        View currentView = this.f4880n.getCurrentView();
        if ((currentView instanceof t) && (b8Var = ((t) currentView).f4858a) != null) {
            ArrayList arrayList = b8Var.f3302i;
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
        a aVar = this.f4880n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            b8 b8Var = this.f4878e;
            if (obj == b8Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof t) {
                        t tVar = (t) view;
                        if (tVar.f4858a == b8Var) {
                            tVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f4879f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof t) {
                        t tVar2 = (t) view2;
                        if (tVar2.f4858a == objArr[0]) {
                            tVar2.v.l();
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
                if (view3 instanceof t) {
                    ((t) view3).v.l();
                }
                i13++;
            }
        }
    }

    public abstract boolean e(MessageObject messageObject);

    public final void f() {
        b8 b8Var;
        View currentView = this.f4880n.getCurrentView();
        if ((currentView instanceof t) && (b8Var = ((t) currentView).f4858a) != null) {
            ArrayList arrayList = b8Var.f3302i;
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
        View currentView = this.f4880n.getCurrentView();
        if (currentView instanceof t) {
            b8 b8Var = ((t) currentView).f4858a;
            if (b8Var != null) {
                ArrayList arrayList = b8Var.f3302i;
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
        b8 b8Var;
        a aVar = this.f4880n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof t) && (b8Var = ((t) view).f4858a) != null) {
            return b8Var.E;
        }
        return null;
    }

    public b8 getCurrentList() {
        b8 b8Var;
        View currentView = this.f4880n.getCurrentView();
        if ((currentView instanceof t) && (b8Var = ((t) currentView).f4858a) != null) {
            return b8Var;
        }
        return null;
    }

    public ll0 getCurrentListView() {
        View currentView = this.f4880n.getCurrentView();
        if (currentView instanceof t) {
            return ((t) currentView).f4862f;
        }
        return null;
    }

    public int getItemsCount() {
        b8 b8Var;
        View currentView = this.f4880n.getCurrentView();
        if ((currentView instanceof t) && (b8Var = ((t) currentView).f4858a) != null) {
            return b8Var.f3302i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        b8 b8Var;
        View currentView = this.f4880n.getCurrentView();
        if ((currentView instanceof t) && (b8Var = ((t) currentView).f4858a) != null) {
            ArrayList arrayList = b8Var.f3302i;
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
        b8 b8Var;
        o8 o8Var;
        ArrayList arrayList = new ArrayList(this.f4878e.G);
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
        u8 storiesController = MessagesController.getInstance(this.f4876b).getStoriesController();
        long j3 = this.d;
        ArrayList E2 = storiesController.E(j3);
        if (E2 != null) {
            int size2 = E2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E2.get(i11);
                i11++;
                t8 t8Var = (t8) obj2;
                if (t8Var != null && (o8Var = t8Var.f3767c) != null && o8Var.J0 == j3 && !TextUtils.isEmpty(o8Var.K0) && !arrayList.contains(o8Var.K0)) {
                    arrayList.add(o8Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f4879f;
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
                    if (TextUtils.equals(((b8) arrayList4.get(i13)).E, str2)) {
                        b8Var = (b8) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    b8Var = null;
                    break;
                }
            }
            if (b8Var == null) {
                b8 b8Var2 = new b8(this.f4876b, this.d, str2, null);
                b8Var2.H(null);
                b8Var = b8Var2;
            }
            arrayList3.add(b8Var);
        }
        a aVar = this.f4880n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(w1.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        nq nqVar = new nq(R.drawable.msg_filled_plus, 0);
        nqVar.setScale(0.9f, 0.9f);
        nqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(nqVar, 0, 1, 33);
        h81 h81Var = this.f4881r;
        h81Var.a(-1, spannableString);
        h81Var.f26685x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f4882s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f4884x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f4882s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f4883w = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            h81Var.setTranslationY(AndroidUtilities.dp(f7));
            if (z11) {
                f11 = 42.0f;
            }
            aVar.setTranslationY(AndroidUtilities.dp(f11));
            return;
        }
        float f12 = this.f4883w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f4884x = ofFloat;
        ofFloat.addUpdateListener(new d0(this, 15));
        this.f4884x.addListener(new q0(5, this, z11));
        this.f4884x.setDuration(320L);
        this.f4884x.setInterpolator(pr.h);
        this.f4884x.start();
    }

    public final void j() {
        View currentView = this.f4880n.getCurrentView();
        if (currentView instanceof t) {
            t tVar = (t) currentView;
            i iVar = tVar.f4862f;
            for (int i10 = 0; i10 < iVar.getChildCount(); i10++) {
                View childAt = iVar.getChildAt(i10);
                if (childAt instanceof t7) {
                    t7 t7Var = (t7) childAt;
                    t7Var.i(tVar.W.c(t7Var.getMessageObject()), true);
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
        int i10 = this.f4876b;
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
        int i10 = this.f4876b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f4880n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof t) {
                    ((t) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
