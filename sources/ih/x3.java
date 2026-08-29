package ih;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import jh.i7;
import jh.k7;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.gr0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.rb;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public abstract class x3 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap P = new HashMap();
    public final TextView A;
    public final hp B;
    public final FrameLayout C;
    public int D;
    public j70 E;
    public SpannableStringBuilder F;
    public int G;
    public boolean H;
    public int I;
    public final l2 J;
    public final vd.a K;
    public int L;
    public int M;
    public o2 N;
    public ViewGroup O;
    public final org.telegram.ui.ActionBar.o2 f9501a;
    public final int f9502b;
    public final long f9503c;
    public final k7 d;
    public final i7 f9504e;
    public final org.telegram.ui.ActionBar.c6 f9505f;
    public final r2 h;
    public final y71 f9506n;
    public final FrameLayout f9507r;
    public final SpannableStringBuilder f9508s;
    public final SpannableStringBuilder v;
    public final nh.d f9509w;
    public int f9510x;
    public final LinearLayout f9511y;

    public x3(int r26, long r27, android.content.Context r29, org.telegram.ui.ActionBar.o2 r30, org.telegram.ui.ActionBar.c6 r31) {
        throw new UnsupportedOperationException("Method not decompiled: ih.x3.<init>(int, long, android.content.Context, org.telegram.ui.ActionBar.o2, org.telegram.ui.ActionBar.c6):void");
    }

    public static void j(org.telegram.ui.ActionBar.g1 g1Var, k7 k7Var, Runnable runnable, int i10) {
        g1Var.setOnClickListener(new bg.p2(k7Var, i10, runnable, 2));
        g1Var.setOnLongClickListener(new j2(k7Var, i10, runnable));
    }

    public final void a() {
        k7 k7Var;
        n3 currentPage = getCurrentPage();
        if (currentPage != null && (k7Var = currentPage.f9296e) != null && currentPage.d) {
            int i10 = k7Var.d;
            new s3(this.f9501a, this.f9503c, i10, new bg.n3(this, i10, currentPage, 1)).show();
        }
    }

    public final boolean b() {
        i7 i7Var = this.f9504e;
        if (!i7Var.h() || i7Var.d().size() >= MessagesController.getInstance(this.f9502b).config.stargiftsCollectionsLimit.get()) {
            return false;
        }
        return true;
    }

    public final boolean c() {
        int i10 = this.f9502b;
        long j10 = this.f9503c;
        if (j10 >= 0) {
            if (j10 != 0 && j10 != UserConfig.getInstance(i10).getClientUserId()) {
                return false;
            }
            return true;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        if (this.f9503c >= 0 || this.d.h == null) {
            return false;
        }
        return true;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12;
        int i13;
        int i14 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f9511y;
        nh.d dVar = this.f9509w;
        long j10 = this.f9503c;
        int i15 = 8;
        if (i10 == i14) {
            if (((Long) objArr[0]).longValue() == j10) {
                if (d()) {
                    i13 = 8;
                } else {
                    i13 = 0;
                }
                dVar.setVisibility(i13);
                if (d()) {
                    i15 = 0;
                }
                linearLayout.setVisibility(i15);
                this.f9510x = 60;
                Boolean bool = this.d.h;
                if (bool != null) {
                    this.B.a(bool.booleanValue(), true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() == j10) {
                f(true);
                n();
            }
        } else if (i10 == NotificationCenter.updateInterfaces) {
            if (d()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            dVar.setVisibility(i12);
            if (d()) {
                i15 = 0;
            }
            linearLayout.setVisibility(i15);
            this.f9510x = 60;
            setVisibleHeight(this.M);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.I > 0) {
            ArrayList d = this.f9504e.d();
            int i10 = 0;
            while (true) {
                if (i10 < d.size()) {
                    if (((TL_stars.TL_starGiftCollection) d.get(i10)).collection_id == this.I) {
                        tL_starGiftCollection = (TL_stars.TL_starGiftCollection) d.get(i10);
                        break;
                    }
                    i10++;
                } else {
                    i10 = -1;
                    tL_starGiftCollection = null;
                    break;
                }
            }
            if (i10 >= 0 && tL_starGiftCollection != null) {
                this.I = 0;
                this.f9506n.d(tL_starGiftCollection.collection_id, i10 + 1);
            }
        }
    }

    public final void f(boolean z10) {
        r2 r2Var = this.h;
        if (r2Var != null && this.f9506n != null) {
            r2Var.o(z10);
            e();
        }
    }

    public final boolean g() {
        if (this.H) {
            return true;
        }
        n3 currentPage = getCurrentPage();
        if (currentPage != null && currentPage.f9298n) {
            return true;
        }
        return false;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f9507r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.x3.B(this.f9510x, Math.max(AndroidUtilities.dp(240.0f), this.M) + (-frameLayout.getTop()), 1);
        if (this.M < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.M, AndroidUtilities.dp(this.f9510x));
        }
        return (int) (AndroidUtilities.dp(this.f9510x) - translationY);
    }

    public k7 getCurrentList() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f9296e;
        }
        return this.d;
    }

    public jl0 getCurrentListView() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f9297f;
        }
        return null;
    }

    public n3 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (n3) currentView;
    }

    public int getGiftsCount() {
        int i10;
        k7 k7Var;
        int i11;
        n3 currentPage = getCurrentPage();
        k7 k7Var2 = this.d;
        if (currentPage != null && (k7Var = currentPage.f9296e) != k7Var2) {
            if (k7Var != null && (i11 = k7Var.f12389n) > 0) {
                return i11;
            }
        } else if (k7Var2 != null && (i10 = k7Var2.f12389n) > 0) {
            return i10;
        }
        int i12 = this.f9502b;
        long j10 = this.f9503c;
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
            if (userFull == null) {
                return 0;
            }
            return userFull.stargifts_count;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j10);
        if (chatFull == null) {
            return 0;
        }
        return chatFull.stargifts_count;
    }

    public long getLastEmojisHash() {
        long j10 = 0;
        k7 k7Var = this.d;
        if (k7Var != null && !k7Var.f12387l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < k7Var.f12387l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) k7Var.f12387l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f22398id));
                    j10 = Objects.hash(Long.valueOf(j10), Long.valueOf(document.f22398id));
                    i10++;
                }
            }
        }
        return j10;
    }

    public float getTabsHeight() {
        View[] viewPages;
        r2 r2Var = this.h;
        float f9 = 0.0f;
        if (r2Var.getViewPages() != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    f9 = (((n3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + f9;
                }
            }
        }
        return f9;
    }

    public float getTabsVisibility() {
        y71 y71Var = this.f9506n;
        if (y71Var != null) {
            return y71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        View view;
        int i10;
        e70 e70Var;
        Context context = getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        if (findActivity != null) {
            view = findActivity.getCurrentFocus();
        } else {
            view = null;
        }
        org.telegram.ui.ActionBar.c2[] c2VarArr = new org.telegram.ui.ActionBar.c2[1];
        org.telegram.ui.ActionBar.c6 c6Var = this.f9505f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str != null) {
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        v2 v2Var = new v2(this, context, c6Var);
        v2Var.lineYFix = true;
        v2Var.setOnEditorActionListener(new w2(v2Var, callback, c2VarArr, view));
        MediaDataController.getInstance(this.f9502b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        v2Var.setTextSize(1, 18.0f);
        v2Var.setTextColor(g6.v0(g6.f23169j5, c6Var));
        v2Var.setHintColor(g6.v0(g6.Xh, c6Var));
        v2Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        v2Var.setFocusable(true);
        v2Var.setInputType(147457);
        v2Var.setLineColors(g6.v0(g6.f23189k6, c6Var), g6.v0(g6.f23206l6, c6Var), g6.v0(g6.f23279p7, c6Var));
        v2Var.setImeOptions(6);
        v2Var.setBackgroundDrawable(null);
        v2Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        v2Var.addTextChangedListener(new x2(v2Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        v2Var.setText(str);
        linearLayout.addView(v2Var, i7.f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f22714a.f22778a = AndroidUtilities.dp(292.0f);
        if (str != null) {
            i10 = R.string.Edit;
        } else {
            i10 = R.string.Create;
        }
        alertDialog$Builder.k(LocaleController.getString(i10), new a9.s(20, v2Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new eg.c(23));
        c2VarArr[0] = alertDialog$Builder.f22714a;
        j70 j70Var = this.E;
        if (j70Var != null && (e70Var = j70Var.f29590m) != null) {
            e70Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(findActivity, this.f9501a.getClassGuid());
        c2VarArr[0].setOnDismissListener(new j(this, v2Var, findActivity, 1));
        c2VarArr[0].setOnShowListener(new k(1, v2Var));
        c2VarArr[0].show();
        org.telegram.ui.ActionBar.c2 c2Var = c2VarArr[0];
        c2Var.f22784d0 = false;
        c2Var.d(-1);
        v2Var.setSelection(v2Var.getText().length());
    }

    public final void i() {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        k7 k7Var;
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            i7 i7Var = this.f9504e;
            if (i11 < i7Var.d().size()) {
                if (i11 >= 0 && i11 < i7Var.d().size()) {
                    k7Var = i7Var.e(((TL_stars.TL_starGiftCollection) i7Var.d().get(i11)).collection_id);
                } else {
                    k7Var = null;
                }
                if (k7Var != null) {
                    return k7Var.f12387l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float f9;
        float nextPositionAlpha;
        boolean z10;
        SpannableStringBuilder spannableStringBuilder;
        rb rbVar;
        r2 r2Var = this.h;
        if (r2Var != null) {
            float f10 = 1.0f;
            if (r2Var.getCurrentPosition() == r2Var.getNextPosition()) {
                if (!k(r2Var.getCurrentPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * f10;
            } else {
                if (k(r2Var.getCurrentPosition())) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                float currentPositionAlpha = r2Var.getCurrentPositionAlpha() * f9;
                if (!k(r2Var.getNextPosition())) {
                    f10 = 0.0f;
                }
                nextPositionAlpha = ((r2Var.getNextPositionAlpha() * f10) + currentPositionAlpha) * (AndroidUtilities.dp(68.0f) + 2);
            }
            FrameLayout frameLayout = this.f9507r;
            float B = nextPositionAlpha + org.telegram.messenger.x3.B(this.f9510x, (-frameLayout.getTop()) + this.M, 1);
            int i10 = 0;
            if (this.M > AndroidUtilities.dp(184.0f)) {
                z10 = true;
            } else {
                z10 = false;
            }
            vd.a aVar = this.K;
            aVar.a(z10, true);
            float f11 = aVar.f49505e;
            float lerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + B, B, f11);
            this.C.setTranslationY(lerp - AndroidUtilities.dp(200.0f));
            frameLayout.setTranslationY(lerp - this.L);
            frameLayout.setAlpha(f11);
            if (f11 <= 0.0f) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
            if (this.f9504e.h() && r2Var.getPositionAnimated() >= 0.5f) {
                spannableStringBuilder = this.v;
            } else {
                spannableStringBuilder = this.f9508s;
            }
            this.f9509w.g(spannableStringBuilder, true, true);
            mc mcVar = mc.f30644w;
            if (mcVar != null && (rbVar = mcVar.f30648e) != null) {
                rbVar.updatePosition();
            }
        }
    }

    public final void m() {
        nh.d dVar = this.f9509w;
        dVar.j();
        int dp = AndroidUtilities.dp(19.0f);
        int i10 = g6.Oh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f9505f;
        dVar.setBackground(g6.b0(dp, ((gr0) this).Q.V0(g6.v0(i10, c6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    n3 n3Var = (n3) view;
                    org.telegram.ui.ActionBar.c6 c6Var2 = n3Var.f9295c;
                    if (n3Var.f9300s != null) {
                        n3Var.f9301w.setTextColor(g6.v0(g6.G6, c6Var2));
                        TextView textView = n3Var.f9302x;
                        int i11 = g6.Oh;
                        textView.setTextColor(g6.v0(i11, c6Var2));
                        n3Var.f9302x.setBackground(g6.Y(g6.l1(0.1f, g6.v0(i11, c6Var2)), 4, 4));
                    } else {
                        n3Var.B.setTextColor(g6.v0(g6.G6, c6Var2));
                        n3Var.C.setTextColor(g6.v0(g6.f23433y6, c6Var2));
                        n3Var.D.j();
                    }
                }
            }
        }
        this.A.setTextColor(g6.v0(g6.f23169j5, c6Var));
        this.f9511y.setBackground(g6.Y(g6.v0(g6.f23152i6, c6Var), 24, 24));
    }

    public final void n() {
        boolean z10;
        View[] viewPages;
        if (this.f9504e.d().isEmpty() && !b()) {
            z10 = false;
        } else {
            z10 = true;
        }
        r2 r2Var = this.h;
        if (r2Var.getViewPages() != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    ((n3) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f9;
        View[] viewPages;
        float f10;
        y71 y71Var = this.f9506n;
        if (y71Var == null) {
            return;
        }
        float min = Math.min(this.G, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float clamp01 = Utilities.clamp01(AndroidUtilities.ilerp(min - this.G, -AndroidUtilities.dp(42.0f), 0.0f));
        float lerp = AndroidUtilities.lerp(0.9f, 1.0f, clamp01);
        y71Var.setTranslationY(min);
        y71Var.setScaleX(lerp);
        y71Var.setScaleY(lerp);
        r2 r2Var = this.h;
        if (r2Var.getViewPages() != null) {
            f9 = 0.0f;
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    if (((n3) view).E) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    f9 += f10;
                }
            }
        } else {
            f9 = 0.0f;
        }
        y71Var.setAlpha(i7.w.a(f9, 0.0f, 1.0f) * clamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f9502b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        k7 k7Var = this.d;
        if (k7Var != null) {
            k7Var.f12390o = true;
            k7Var.a();
        }
        i7 i7Var = this.f9504e;
        if (i7Var != null) {
            i7Var.f12266j = true;
            i7Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        n3 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f9502b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        k7 k7Var = this.d;
        if (k7Var != null) {
            k7Var.f12390o = false;
        }
        i7 i7Var = this.f9504e;
        if (i7Var != null) {
            i7Var.f12266j = false;
        }
    }

    public abstract void p(boolean z10);

    public void setButtonOffset(int i10) {
        if (this.L != i10) {
            this.L = i10;
            l();
        }
    }

    public void setPaddingTop(int i10) {
        View[] viewPages;
        if (this.G != i10) {
            this.G = i10;
            for (View view : this.h.getViewPages()) {
                if (view instanceof n3) {
                    n3 n3Var = (n3) view;
                    h3 h3Var = n3Var.f9297f;
                    int paddingTop = h3Var.getPaddingTop();
                    h3Var.setPadding(AndroidUtilities.dp(9.0f), this.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(h3Var, new n2(n3Var, paddingTop - h3Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        n3 currentPage = getCurrentPage();
        if (currentPage != null) {
            n3.d(currentPage, z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.H != z10) {
            this.H = z10;
            p(g());
            this.f9506n.setReordering(z10);
            if (z10) {
                org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                if (U instanceof ProfileActivity) {
                    ProfileActivity profileActivity = (ProfileActivity) U;
                    profileActivity.G4(false);
                    AndroidUtilities.runOnUIThread(new i2(profileActivity, 0));
                }
            }
            if (!z10) {
                l2 l2Var = this.J;
                AndroidUtilities.cancelRunOnUIThread(l2Var);
                AndroidUtilities.runOnUIThread(l2Var);
            }
        }
    }

    public void setVisibleHeight(int i10) {
        View[] viewPages;
        this.M = i10;
        l();
        r2 r2Var = this.h;
        if (r2Var != null) {
            for (View view : r2Var.getViewPages()) {
                if (view instanceof n3) {
                    ((n3) view).setVisibleHeight(this.M);
                }
            }
        }
    }
}
