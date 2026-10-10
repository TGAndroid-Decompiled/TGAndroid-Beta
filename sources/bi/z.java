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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Cells.t7;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.o91;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.rs0;
import org.telegram.ui.Components.yi;
import w7.x5;
public abstract class z extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static LongSparseArray E;
    public static LongSparseArray F;
    public final n2 f3940a;
    public final int f3941b;
    public final e6 f3942c;
    public final long d;
    public final v8 f3943e;
    public final ArrayList f3944f;
    public final ArrayList h;
    public final a f3945n;
    public final o91 f3946r;
    public Boolean f3947s;
    public int v;
    public float f3948w;
    public ValueAnimator f3949x;
    public int f3950y;

    public z(Context context, n2 n2Var, long j3) {
        super(context);
        this.f3944f = new ArrayList();
        this.h = new ArrayList();
        this.f3947s = null;
        this.v = AndroidUtilities.displaySize.y;
        this.f3950y = Utilities.clamp(SharedConfig.storiesColumnsCount, 6, 2);
        this.f3940a = n2Var;
        int currentAccount = n2Var.getCurrentAccount();
        this.f3941b = currentAccount;
        e6 resourceProvider = n2Var.getResourceProvider();
        this.f3942c = resourceProvider;
        this.d = j3;
        setBackgroundColor(i6.v(i6.w0(i6.f20801d6, resourceProvider), i6.m1(0.04f, i6.w0(i6.G6, resourceProvider))));
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
        this.f3943e = v8Var;
        rs0 rs0Var = (rs0) this;
        a aVar = new a(rs0Var, context);
        this.f3945n = aVar;
        aVar.setAllowDisallowInterceptTouch(true);
        aVar.setAdapter(new b(rs0Var, context));
        addView(aVar, x5.e(-1, -1, 119));
        o91 n10 = aVar.n(9, true);
        this.f3946r = n10;
        n10.f29422r = 12;
        n10.setPreTabClick(new a1.c(rs0Var, 11));
        addView(n10, x5.e(-1, 42, 48));
        i(false);
    }

    public final void a(String str) {
        n2 n2Var = this.f3940a;
        if (n2Var != null && n2Var.getParentActivity() != null) {
            yi yiVar = new yi(n2Var.getParentActivity(), this.f3940a, false, false, false, this.f3942c);
            yiVar.N1(1, false);
            yiVar.W0 = true;
            yiVar.V0 = false;
            yiVar.f33255m1.setText(LocaleController.getString(R.string.ChoosePhotoOrVideo));
            yiVar.f33247j0.f0();
            yiVar.f33226c2 = new c(this, yiVar, str);
            yiVar.t1();
            yiVar.show();
        }
    }

    public final void b(String str) {
        v8 v8Var;
        TLRPC.MessageMedia messageMedia;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f3943e.G.remove(str);
        this.h.remove(str);
        int i10 = 0;
        while (true) {
            ArrayList arrayList = this.f3944f;
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
            ArrayList arrayList2 = v8Var.f899i;
            TL_bots.deletePreviewMedia deletepreviewmedia = new TL_bots.deletePreviewMedia();
            int i11 = this.f3941b;
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
        this.f3946r.d(-1, 0);
    }

    public abstract boolean c(MessageObject messageObject);

    public final boolean d() {
        v8 v8Var;
        View currentView = this.f3945n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3923a) != null) {
            ArrayList arrayList = v8Var.f899i;
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
        a aVar = this.f3945n;
        int i13 = 0;
        if (i10 == i12) {
            Object obj = objArr[0];
            v8 v8Var = this.f3943e;
            if (obj == v8Var) {
                i(true);
                View[] viewPages = aVar.getViewPages();
                int length = viewPages.length;
                while (i13 < length) {
                    View view = viewPages[i13];
                    if (view instanceof u) {
                        u uVar = (u) view;
                        if (uVar.f3923a == v8Var) {
                            uVar.v.l();
                        }
                    }
                    i13++;
                }
            } else if (this.f3944f.indexOf(obj) >= 0) {
                View[] viewPages2 = aVar.getViewPages();
                for (View view2 : viewPages2) {
                    if (view2 instanceof u) {
                        u uVar2 = (u) view2;
                        if (uVar2.f3923a == objArr[0]) {
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
        View currentView = this.f3945n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3923a) != null) {
            ArrayList arrayList = v8Var.f899i;
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
        View currentView = this.f3945n.getCurrentView();
        if (currentView instanceof u) {
            v8 v8Var = ((u) currentView).f3923a;
            if (v8Var != null) {
                ArrayList arrayList = v8Var.f899i;
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
        a aVar = this.f3945n;
        View[] viewPages = aVar.getViewPages();
        if (Math.abs(aVar.getCurrentPosition() - aVar.getPositionAnimated()) >= 0.5f || (view = viewPages[1]) == null) {
            view = viewPages[0];
        }
        if ((view instanceof u) && (v8Var = ((u) view).f3923a) != null) {
            return v8Var.E;
        }
        return null;
    }

    public v8 getCurrentList() {
        v8 v8Var;
        View currentView = this.f3945n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3923a) != null) {
            return v8Var;
        }
        return null;
    }

    public rm0 getCurrentListView() {
        View currentView = this.f3945n.getCurrentView();
        if (currentView instanceof u) {
            return ((u) currentView).f3927f;
        }
        return null;
    }

    public int getItemsCount() {
        v8 v8Var;
        View currentView = this.f3945n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3923a) != null) {
            return v8Var.f899i.size();
        }
        return 0;
    }

    public int getStartedTrackingX() {
        return 0;
    }

    public final void h() {
        v8 v8Var;
        View currentView = this.f3945n.getCurrentView();
        if ((currentView instanceof u) && (v8Var = ((u) currentView).f3923a) != null) {
            ArrayList arrayList = v8Var.f899i;
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
        ArrayList arrayList = new ArrayList(this.f3943e.G);
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
        m9 storiesController = MessagesController.getInstance(this.f3941b).getStoriesController();
        long j3 = this.d;
        ArrayList E2 = storiesController.E(j3);
        if (E2 != null) {
            int size2 = E2.size();
            int i11 = 0;
            while (i11 < size2) {
                Object obj2 = E2.get(i11);
                i11++;
                l9 l9Var = (l9) obj2;
                if (l9Var != null && (l8Var = l9Var.f1351c) != null && l8Var.J0 == j3 && !TextUtils.isEmpty(l8Var.K0) && !arrayList.contains(l8Var.K0)) {
                    arrayList.add(l8Var.K0);
                }
            }
        }
        ArrayList arrayList3 = this.f3944f;
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
                v8 v8Var2 = new v8(this.f3941b, this.d, str2, null);
                v8Var2.H(null);
                v8Var = v8Var2;
            }
            arrayList3.add(v8Var);
        }
        a aVar = this.f3945n;
        aVar.o(true);
        SpannableString spannableString = new SpannableString(org.telegram.messenger.q.g(R.string.ProfileBotLanguageAdd, new StringBuilder("+ ")));
        er erVar = new er(R.drawable.msg_filled_plus, 0);
        erVar.setScale(0.9f, 0.9f);
        erVar.spaceScaleX = 0.85f;
        spannableString.setSpan(erVar, 0, 1, 33);
        o91 o91Var = this.f3946r;
        o91Var.a(-1, spannableString);
        o91Var.f29426x.l();
        if (arrayList3.size() + 1 > 1) {
            z11 = true;
        } else {
            z11 = false;
        }
        Boolean bool = this.f3947s;
        if (bool != null && bool.booleanValue() == z11) {
            return;
        }
        ValueAnimator valueAnimator = this.f3949x;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.f3947s = Boolean.valueOf(z11);
        float f10 = 1.0f;
        float f11 = 0.0f;
        if (!z10) {
            if (!z11) {
                f10 = 0.0f;
            }
            this.f3948w = f10;
            if (z11) {
                f7 = 0.0f;
            } else {
                f7 = -42.0f;
            }
            o91Var.setTranslationY(AndroidUtilities.dp(f7));
            if (z11) {
                f11 = 42.0f;
            }
            aVar.setTranslationY(AndroidUtilities.dp(f11));
            return;
        }
        float f12 = this.f3948w;
        if (!z11) {
            f10 = 0.0f;
        }
        ValueAnimator ofFloat = ValueAnimator.ofFloat(f12, f10);
        this.f3949x = ofFloat;
        ofFloat.addUpdateListener(new ai.a(this, 14));
        this.f3949x.addListener(new ai.n(4, this, z11));
        this.f3949x.setDuration(320L);
        this.f3949x.setInterpolator(is.h);
        this.f3949x.start();
    }

    public final void j() {
        View currentView = this.f3945n.getCurrentView();
        if (currentView instanceof u) {
            u uVar = (u) currentView;
            j jVar = uVar.f3927f;
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
        int i10 = this.f3941b;
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
        int i10 = this.f3941b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(i10);
        if (longSparseArray2 != null) {
            longSparseArray2.remove(this.d);
        }
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesListUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.storiesUpdated);
    }

    public void setVisibleHeight(int i10) {
        this.v = i10;
        View[] viewPages = this.f3945n.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view instanceof u) {
                    ((u) view).setVisibleHeight(i10);
                }
            }
        }
    }
}
