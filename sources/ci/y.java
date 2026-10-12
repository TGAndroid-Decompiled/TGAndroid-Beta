package ci;

import ah.c0;
import ah.p0;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import bi.f8;
import bi.w8;
import bi.x8;
import di.k8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.j91;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.vi;
import w7.a6;
public abstract class y extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final m2 f4796a;
    public final int f4797b;
    public final c6 f4798c;
    public final long d;
    public final f8 e;
    public final ArrayList f4799f;
    public final ArrayList h;
    public final a f4800n;
    public final j91 f4801r;
    public Boolean f4802s;
    public int v;
    public float f4803w;
    public ValueAnimator f4804x;
    public int f4805y;

    public y(Context context, m2 m2Var, long j10) {
        super(context);
        this.f4799f = new ArrayList();
        this.h = new ArrayList();
        this.f4802s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f4805y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f4796a = m2Var;
        int currentAccount = m2Var.getCurrentAccount();
        this.f4797b = currentAccount;
        c6 resourceProvider = m2Var.getResourceProvider();
        this.f4798c = resourceProvider;
        this.d = j10;
        setBackgroundColor(g6.v(g6.w0(g6.f19901d6, resourceProvider), g6.m1(0.04f, g6.w0(g6.G6, resourceProvider))));
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
        f8 f8Var = (f8) longSparseArray.get(j10);
        if (f8Var == null) {
            f8 f8Var2 = new f8(currentAccount, j10, "", null);
            longSparseArray.put(j10, f8Var2);
            f8Var = f8Var2;
        }
        this.e = f8Var;
        ms0 ms0Var = (ms0) this;
        a aVar = new a(ms0Var, context);
        this.f4800n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(ms0Var, context));
        addView(aVar, a6.e(-1, -1, 119));
        j91 n10 = aVar.n(9, true);
        this.f4801r = n10;
        n10.f26294r = 12;
        n10.setPreTabClick(new a1.c(ms0Var, 13));
        addView(n10, a6.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        m2 m2Var = this.f4796a;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            vi viVar = new vi(m2Var.getParentActivity(), this.f4796a, false, false, false, this.f4798c);
            viVar.N1(1, false);
            viVar.W0 = true;
            viVar.V0 = false;
            viVar.f30021m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            viVar.f30013j0.f0();
            viVar.f29993c2 = new c(this, viVar, str);
            viVar.t1();
            viVar.show();
        }
    }

    public final void b(String str) {
        f8 f8Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f4799f;
            if (i10 < arrayList.size()) {
                f8Var = (f8) arrayList.get(i10);
                if (f8Var != null && TextUtils.equals(f8Var.E, str)) {
                    break;
                }
                i10++;
            } else {
                f8Var = null;
                break;
            }
        }
        if (f8Var != null) {
            ArrayList arrayList2 = f8Var.f3429i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f4797b;
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
        this.f4801r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        f8 f8Var;
        View currentView = this.f4800n.getCurrentView();
        if ((currentView instanceof t) && (f8Var = ((t) currentView).f4780a) != null) {
            ArrayList arrayList = f8Var.f3429i;
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
        a aVar = this.f4800n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            f8 f8Var = this.e;
            if (obj == f8Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof t) {
                        t tVar = (t) view;
                        if (tVar.f4780a == f8Var) {
                            tVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f4799f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof t) {
                        t tVar2 = (t) view2;
                        if (tVar2.f4780a == objArr[0]) {
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
        f8 f8Var;
        View currentView = this.f4800n.getCurrentView();
        if ((currentView instanceof t) && (f8Var = ((t) currentView).f4780a) != null) {
            ArrayList arrayList = f8Var.f3429i;
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
        View currentView = this.f4800n.getCurrentView();
        if (currentView instanceof t) {
            f8 f8Var = ((t) currentView).f4780a;
            if (f8Var != null) {
                ArrayList arrayList = f8Var.f3429i;
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
        f8 f8Var;
        a aVar = this.f4800n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof t) && (f8Var = ((t) view).f4780a) != null) {
            return f8Var.E;
        }
        return null;
    }

    public f8 getCurrentList() {
        f8 f8Var;
        View currentView = this.f4800n.getCurrentView();
        if ((currentView instanceof t) && (f8Var = ((t) currentView).f4780a) != null) {
            return f8Var;
        }
        return null;
    }

    public mm0 getCurrentListView() {
        View currentView = this.f4800n.getCurrentView();
        if (currentView instanceof t) {
            return ((t) currentView).f4783f;
        }
        return null;
    }

    public int getItemsCount() {
        f8 f8Var;
        View currentView = this.f4800n.getCurrentView();
        if ((currentView instanceof t) && (f8Var = ((t) currentView).f4780a) != null) {
            return f8Var.f3429i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        f8 f8Var;
        View currentView = this.f4800n.getCurrentView();
        if ((currentView instanceof t) && (f8Var = ((t) currentView).f4780a) != null) {
            ArrayList arrayList = f8Var.f3429i;
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
        f8 f8Var;
        k8 k8Var;
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
        x8 storiesController = MessagesController.getInstance(this.f4797b).getStoriesController();
        long j10 = this.d;
        ArrayList E2 = storiesController.E(j10);
        if (E2 != null) {
            int size2 = E2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E2.get(i11);
                i11++;
                w8 w8Var = (w8) obj2;
                if (w8Var != null && (k8Var = w8Var.f3915c) != null && k8Var.J0 == j10 && !TextUtils.isEmpty(k8Var.K0) && !arrayList.contains(k8Var.K0)) {
                    arrayList.add(k8Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f4799f;
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
                    if (TextUtils.equals(((f8) arrayList4.get(i13)).E, str2)) {
                        f8Var = (f8) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    f8Var = null;
                    break;
                }
            }
            if (f8Var == null) {
                f8 f8Var2 = new f8(this.f4797b, this.d, str2, null);
                f8Var2.H(null);
                f8Var = f8Var2;
            }
            arrayList3.add(f8Var);
        }
        a aVar = this.f4800n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(org.telegram.messenger.q.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        br brVar = new br(R.drawable.msg_filled_plus, 0);
        brVar.setScale(0.9f, 0.9f);
        brVar.spaceScaleX = 0.85f;
        spannableString.setSpan(brVar, 0, 1, 33);
        j91 j91Var = this.f4801r;
        j91Var.a(-1, spannableString);
        j91Var.f26298x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f4802s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f4804x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f4802s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f4803w = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            j91Var.setTranslationY(AndroidUtilities.dp(f7));
            if (z11) {
                f11 = 42.0f;
            }
            aVar.setTranslationY(AndroidUtilities.dp(f11));
            return;
        }
        float f12 = this.f4803w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f4804x = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 15));
        this.f4804x.addListener(new p0(5, this, z11));
        this.f4804x.setDuration(320L);
        this.f4804x.setInterpolator(es.h);
        this.f4804x.start();
    }

    public final void j() {
        View currentView = this.f4800n.getCurrentView();
        if (currentView instanceof t) {
            t tVar = (t) currentView;
            i iVar = tVar.f4783f;
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
        int i10 = this.f4797b;
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
        int i10 = this.f4797b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f4800n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof t) {
                    ((t) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
