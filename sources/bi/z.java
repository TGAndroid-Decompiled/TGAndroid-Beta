package bi;

import ai.l9;
import ai.m9;
import ai.v8;
import android.animation.ValueAnimator;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.LongSparseArray;
import android.view.View;
import android.widget.FrameLayout;
import ci.l8;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.aj;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.js;
import org.telegram.ui.Components.t91;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.ws0;
import w7.w5;
public abstract class z extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final m2 f3939a;
    public final int f3940b;
    public final c6 f3941c;
    public final long d;
    public final v8 f3942e;
    public final ArrayList f3943f;
    public final ArrayList h;
    public final a f3944n;
    public final t91 f3945r;
    public Boolean f3946s;
    public int v;
    public float f3947w;
    public ValueAnimator f3948x;
    public int f3949y;

    public z(Context context, m2 m2Var, long j3) {
        super(context);
        this.f3943f = new ArrayList();
        this.h = new ArrayList();
        this.f3946s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f3949y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f3939a = m2Var;
        int currentAccount = m2Var.getCurrentAccount();
        this.f3940b = currentAccount;
        c6 resourceProvider = m2Var.getResourceProvider();
        this.f3941c = resourceProvider;
        this.d = j3;
        setBackgroundColor(h6.v(h6.w0(h6.f20559d6, resourceProvider), h6.m1(0.04f, h6.w0(h6.G6, resourceProvider))));
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
        v8 v8Var = (v8) longSparseArray.get(j3);
        if (v8Var == null) {
            v8 v8Var2 = new v8(currentAccount, j3, "", null);
            longSparseArray.put(j3, v8Var2);
            v8Var = v8Var2;
        }
        this.f3942e = v8Var;
        ws0 ws0Var = (ws0) this;
        a aVar = new a(ws0Var, context);
        this.f3944n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(ws0Var, context));
        addView(aVar, w5.e(-1, -1, 119));
        t91 n10 = aVar.n(9, true);
        this.f3945r = n10;
        n10.f30822r = 12;
        n10.setPreTabClick(new a1.c(ws0Var, 11));
        addView(n10, w5.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        m2 m2Var = this.f3939a;
        if (m2Var != null && m2Var.getParentActivity() != null) {
            aj ajVar = new aj(m2Var.getParentActivity(), this.f3939a, false, false, false, this.f3941c);
            ajVar.N1(1, false);
            ajVar.W0 = true;
            ajVar.V0 = false;
            ajVar.f24362m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            ajVar.f24354j0.f0();
            ajVar.f24333c2 = new c(this, ajVar, str);
            ajVar.t1();
            ajVar.show();
        }
    }

    public final void b(String str) {
        v8 v8Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3942e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3943f;
            if (i10 < arrayList.size()) {
                v8Var = (v8) arrayList.get(i10);
                if (v8Var != null && TextUtils.equals(v8Var.E, str)) {
                    break;
                }
                i10++;
            } else {
                v8Var = null;
                break;
            }
        }
        if (v8Var != null) {
            ArrayList arrayList2 = v8Var.f897i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f3940b;
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
        this.f3945r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        v8 v8Var;
        View currentView = this.f3944n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3922a) != null) {
            ArrayList arrayList = v8Var.f897i;
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
        a aVar = this.f3944n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            v8 v8Var = this.f3942e;
            if (obj == v8Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof u) {
                        u uVar = (u) view;
                        if (uVar.f3922a == v8Var) {
                            uVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f3943f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof u) {
                        u uVar2 = (u) view2;
                        if (uVar2.f3922a == objArr[0]) {
                            uVar2.v.l();
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
                if (view3 instanceof u) {
                    ((u) view3).v.l();
                }
                i13++;
            }
        }
    }

    public abstract boolean e(MessageObject messageObject);

    public final void f() {
        v8 v8Var;
        View currentView = this.f3944n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3922a) != null) {
            ArrayList arrayList = v8Var.f897i;
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
        View currentView = this.f3944n.getCurrentView();
        if (currentView instanceof u) {
            v8 v8Var = ((u) currentView).f3922a;
            if (v8Var != null) {
                ArrayList arrayList = v8Var.f897i;
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
        v8 v8Var;
        a aVar = this.f3944n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof u) && (v8Var = ((u) view).f3922a) != null) {
            return v8Var.E;
        }
        return null;
    }

    public v8 getCurrentList() {
        v8 v8Var;
        View currentView = this.f3944n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3922a) != null) {
            return v8Var;
        }
        return null;
    }

    public wm0 getCurrentListView() {
        View currentView = this.f3944n.getCurrentView();
        if (currentView instanceof u) {
            return ((u) currentView).f3926f;
        }
        return null;
    }

    public int getItemsCount() {
        v8 v8Var;
        View currentView = this.f3944n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3922a) != null) {
            return v8Var.f897i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        v8 v8Var;
        View currentView = this.f3944n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3922a) != null) {
            ArrayList arrayList = v8Var.f897i;
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
        v8 v8Var;
        l8 l8Var;
        ArrayList arrayList = new ArrayList(this.f3942e.G);
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
        m9 storiesController = MessagesController.getInstance(this.f3940b).getStoriesController();
        long j3 = this.d;
        ArrayList E2 = storiesController.E(j3);
        if (E2 != null) {
            int size2 = E2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E2.get(i11);
                i11++;
                l9 l9Var = (l9) obj2;
                if (l9Var != null && (l8Var = l9Var.f1349c) != null && l8Var.J0 == j3 && !TextUtils.isEmpty(l8Var.K0) && !arrayList.contains(l8Var.K0)) {
                    arrayList.add(l8Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f3943f;
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
                    if (TextUtils.equals(((v8) arrayList4.get(i13)).E, str2)) {
                        v8Var = (v8) arrayList4.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    v8Var = null;
                    break;
                }
            }
            if (v8Var == null) {
                v8 v8Var2 = new v8(this.f3940b, this.d, str2, null);
                v8Var2.H(null);
                v8Var = v8Var2;
            }
            arrayList3.add(v8Var);
        }
        a aVar = this.f3944n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(v0.h(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        gr grVar = new gr(R.drawable.msg_filled_plus, 0);
        grVar.setScale(0.9f, 0.9f);
        grVar.spaceScaleX = 0.85f;
        spannableString.setSpan(grVar, 0, 1, 33);
        t91 t91Var = this.f3945r;
        t91Var.a(-1, spannableString);
        t91Var.f30826x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f3946s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f3948x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f3946s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f3947w = f10;
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
        float f12 = this.f3947w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f3948x = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 14));
        this.f3948x.addListener(new ai.n(4, this, z11));
        this.f3948x.setDuration(320L);
        this.f3948x.setInterpolator(js.h);
        this.f3948x.start();
    }

    public final void j() {
        View currentView = this.f3944n.getCurrentView();
        if (currentView instanceof u) {
            u uVar = (u) currentView;
            j jVar = uVar.f3926f;
            for (int i10 = 0; i10 < jVar.getChildCount(); i10++) {
                View childAt = jVar.getChildAt(i10);
                if (childAt instanceof t7) {
                    t7 t7Var = (t7) childAt;
                    t7Var.i(uVar.W.c(t7Var.getMessageObject()), true);
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
        int i10 = this.f3940b;
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
        int i10 = this.f3940b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f3944n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof u) {
                    ((u) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
