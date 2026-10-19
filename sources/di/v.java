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
import ci.h7;
import ci.i7;
import ci.t6;
import ei.a8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.s7;
import org.telegram.ui.Components.bs;
import org.telegram.ui.Components.c91;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.is0;
import org.telegram.ui.Components.ti;
import org.telegram.ui.Components.yq;
import w7.z5;
public abstract class v extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final n2 f8070a;
    public final int f8071b;
    public final d6 f8072c;
    public final long d;
    public final t6 e;
    public final ArrayList f8073f;
    public final ArrayList h;
    public final a f8074n;
    public final c91 f8075r;
    public Boolean f8076s;
    public int v;
    public float f8077w;
    public ValueAnimator f8078x;
    public int f8079y;

    public v(Context context, n2 n2Var, long j10) {
        super(context);
        this.f8073f = new ArrayList();
        this.h = new ArrayList();
        this.f8076s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f8079y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f8070a = n2Var;
        int currentAccount = n2Var.getCurrentAccount();
        this.f8071b = currentAccount;
        d6 resourceProvider = n2Var.getResourceProvider();
        this.f8072c = resourceProvider;
        this.d = j10;
        setBackgroundColor(h6.v(h6.w0(h6.f20989d6, resourceProvider), h6.m1(0.04f, h6.w0(h6.G6, resourceProvider))));
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
        t6 t6Var = (t6) longSparseArray.get(j10);
        if (t6Var == null) {
            t6 t6Var2 = new t6(currentAccount, j10, "", null);
            longSparseArray.put(j10, t6Var2);
            t6Var = t6Var2;
        }
        this.e = t6Var;
        is0 is0Var = (is0) this;
        a aVar = new a(is0Var, context);
        this.f8074n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(is0Var, context));
        addView(aVar, z5.e(-1, -1, 119));
        c91 n10 = aVar.n(9, true);
        this.f8075r = n10;
        n10.f25148r = 12;
        n10.setPreTabClick(new a1.c(is0Var, 28));
        addView(n10, z5.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        n2 n2Var = this.f8070a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            ti tiVar = new ti(n2Var.getParentActivity(), this.f8070a, false, false, false, this.f8072c);
            tiVar.N1(1, false);
            tiVar.W0 = true;
            tiVar.V0 = false;
            tiVar.f30556m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            tiVar.f30548j0.f0();
            tiVar.f30528c2 = new c(this, tiVar, str);
            tiVar.t1();
            tiVar.show();
        }
    }

    public final void b(String str) {
        t6 t6Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f8073f;
            if (i10 < arrayList.size()) {
                t6Var = (t6) arrayList.get(i10);
                if (t6Var != null && TextUtils.equals(t6Var.E, str)) {
                    break;
                }
                i10++;
            } else {
                t6Var = null;
                break;
            }
        }
        if (t6Var != null) {
            ArrayList arrayList2 = t6Var.f5151i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f8071b;
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
        this.f8075r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        t6 t6Var;
        View currentView = this.f8074n.getCurrentView();
        if ((currentView instanceof r) && (t6Var = ((r) currentView).f8056a) != null) {
            ArrayList arrayList = t6Var.f5151i;
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
        a aVar = this.f8074n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            t6 t6Var = this.e;
            if (obj == t6Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof r) {
                        r rVar = (r) view;
                        if (rVar.f8056a == t6Var) {
                            rVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f8073f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof r) {
                        r rVar2 = (r) view2;
                        if (rVar2.f8056a == objArr[0]) {
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
        t6 t6Var;
        View currentView = this.f8074n.getCurrentView();
        if ((currentView instanceof r) && (t6Var = ((r) currentView).f8056a) != null) {
            ArrayList arrayList = t6Var.f5151i;
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
        View currentView = this.f8074n.getCurrentView();
        if (currentView instanceof r) {
            t6 t6Var = ((r) currentView).f8056a;
            if (t6Var != null) {
                ArrayList arrayList = t6Var.f5151i;
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
        t6 t6Var;
        a aVar = this.f8074n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof r) && (t6Var = ((r) view).f8056a) != null) {
            return t6Var.E;
        }
        return null;
    }

    public t6 getCurrentList() {
        t6 t6Var;
        View currentView = this.f8074n.getCurrentView();
        if ((currentView instanceof r) && (t6Var = ((r) currentView).f8056a) != null) {
            return t6Var;
        }
        return null;
    }

    public im0 getCurrentListView() {
        View currentView = this.f8074n.getCurrentView();
        if (currentView instanceof r) {
            return ((r) currentView).f8059f;
        }
        return null;
    }

    public int getItemsCount() {
        t6 t6Var;
        View currentView = this.f8074n.getCurrentView();
        if ((currentView instanceof r) && (t6Var = ((r) currentView).f8056a) != null) {
            return t6Var.f5151i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        t6 t6Var;
        View currentView = this.f8074n.getCurrentView();
        if ((currentView instanceof r) && (t6Var = ((r) currentView).f8056a) != null) {
            ArrayList arrayList = t6Var.f5151i;
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
        t6 t6Var;
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
        i7 storiesController = MessagesController.getInstance(this.f8071b).getStoriesController();
        long j10 = this.d;
        ArrayList E2 = storiesController.E(j10);
        if (E2 != null) {
            int size2 = E2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E2.get(i11);
                i11++;
                h7 h7Var = (h7) obj2;
                if (h7Var != null && (a8Var = h7Var.f5470c) != null && a8Var.J0 == j10 && !TextUtils.isEmpty(a8Var.K0) && !arrayList.contains(a8Var.K0)) {
                    arrayList.add(a8Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f8073f;
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
                    if (TextUtils.equals(((t6) arrayList4.get(i13)).E, str2)) {
                        t6Var = (t6) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    t6Var = null;
                    break;
                }
            }
            if (t6Var == null) {
                t6 t6Var2 = new t6(this.f8071b, this.d, str2, null);
                t6Var2.H(null);
                t6Var = t6Var2;
            }
            arrayList3.add(t6Var);
        }
        a aVar = this.f8074n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(g0.g(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        yq yqVar = new yq(R.drawable.msg_filled_plus, 0);
        yqVar.setScale(0.9f, 0.9f);
        yqVar.spaceScaleX = 0.85f;
        spannableString.setSpan(yqVar, 0, 1, 33);
        c91 c91Var = this.f8075r;
        c91Var.a(-1, spannableString);
        c91Var.f25152x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f8076s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f8078x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f8076s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f8077w = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            c91Var.setTranslationY(AndroidUtilities.dp(f7));
            if (z11) {
                f11 = 42.0f;
            }
            aVar.setTranslationY(AndroidUtilities.dp(f11));
            return;
        }
        float f12 = this.f8077w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f8078x = ofFloat;
        ofFloat.addUpdateListener(new c0(this, 22));
        this.f8078x.addListener(new p0(5, this, z11));
        this.f8078x.setDuration(320L);
        this.f8078x.setInterpolator(bs.h);
        this.f8078x.start();
    }

    public final void j() {
        View currentView = this.f8074n.getCurrentView();
        if (currentView instanceof r) {
            r rVar = (r) currentView;
            i iVar = rVar.f8059f;
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
        int i10 = this.f8071b;
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
        int i10 = this.f8071b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f8074n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof r) {
                    ((r) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
