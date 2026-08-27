package gh;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.k7;
import hh.m7;
import hh.u7;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.rl;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.jb;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.w60;
import org.telegram.ui.Components.wq0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;

public abstract class d4 extends FrameLayout implements NotificationCenter.NotificationCenterDelegate {
    public static final HashMap P = new HashMap();
    public final TextView A;
    public final bp B;
    public final FrameLayout C;
    public int D;
    public b70 E;
    public SpannableStringBuilder F;
    public int G;
    public boolean H;
    public int I;
    public final o2 J;
    public final ud.a K;
    public int L;
    public int M;
    public s2 N;
    public ViewGroup O;

    public final org.telegram.ui.ActionBar.n2 f7197a;

    public final int f7198b;

    public final long f7199c;
    public final m7 d;

    public final k7 f7200e;

    public final org.telegram.ui.ActionBar.c6 f7201f;
    public final x2 h;

    public final o71 f7202n;

    public final FrameLayout f7203r;

    public final SpannableStringBuilder f7204s;
    public final SpannableStringBuilder v;

    public final lh.d f7205w;

    public int f7206x;

    public final LinearLayout f7207y;

    public d4(int i10, long j10, Context context, org.telegram.ui.ActionBar.n2 n2Var, org.telegram.ui.ActionBar.c6 c6Var) {
        int i11;
        String string;
        int i12;
        TLRPC.EncryptedChat encryptedChatN;
        super(context);
        this.D = -1;
        wq0 wq0Var = (wq0) this;
        this.J = new o2(wq0Var, 2);
        this.K = new ud.a(0, new t2(wq0Var), er.h, 380L, true);
        this.M = AndroidUtilities.displaySize.y;
        this.f7197a = n2Var;
        this.f7198b = i10;
        if (!DialogObject.isEncryptedDialog(j10) || (encryptedChatN = org.telegram.messenger.y1.n(MessagesController.getInstance(i10), j10)) == null) {
            this.f7199c = j10;
        } else {
            this.f7199c = encryptedChatN.user_id;
        }
        int i13 = 0;
        u7.y(i10, false).Q(this.f7199c);
        m7 m7VarG = u7.y(i10, false).G(this.f7199c, true);
        this.d = m7VarG;
        k7 k7VarF = u7.y(i10, false).F(this.f7199c, true);
        this.f7200e = k7VarF;
        k7VarF.f9616g = m7VarG;
        m7VarG.f9756o = true;
        if ((n2Var instanceof ProfileActivity) && ((ProfileActivity) n2Var).f36042r1) {
            m7VarG.f9749g = 4;
            m7VarG.f9747e = true;
            m7VarG.i(true);
        } else if (!m7VarG.f9747e || m7VarG.f9749g != 783) {
            m7VarG.f9749g = 783;
            m7VarG.f9747e = true;
            m7VarG.i(true);
        }
        m7VarG.a();
        this.f7201f = c6Var;
        x2 x2Var = new x2(wq0Var, context, n2Var);
        this.h = x2Var;
        x2Var.setAllowDisallowInterceptTouch(true);
        x2Var.setAdapter(new y2(wq0Var, i10, c6Var));
        addView(x2Var, h7.z5.e(-1, -1, 119));
        o71 o71VarN = x2Var.n(10, true);
        this.f7202n = o71VarN;
        int i14 = org.telegram.ui.ActionBar.g6.Gh;
        int i15 = org.telegram.ui.ActionBar.g6.G6;
        int i16 = org.telegram.ui.ActionBar.g6.Eh;
        int i17 = org.telegram.ui.ActionBar.g6.Hh;
        int i18 = org.telegram.ui.ActionBar.g6.f23322s8;
        o71VarN.L = i14;
        o71VarN.M = i15;
        o71VarN.N = i16;
        o71VarN.O = i17;
        o71VarN.P = i18;
        o71VarN.K.setColor(org.telegram.ui.ActionBar.g6.v0(i14, o71VarN.f31214f0));
        o71VarN.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o71VarN.setClipToPadding(false);
        o71VarN.f31223r = 12;
        o71VarN.setPreTabClick(new t2(wq0Var));
        o71VarN.setOnTabLongClick(new u2(wq0Var, i10, n2Var, context, c6Var, 0));
        addView(o71VarN, h7.z5.e(-1, 42, 48));
        og.c cVar = new og.c();
        int i19 = org.telegram.ui.ActionBar.g6.f23053d6;
        cVar.a(org.telegram.ui.ActionBar.g6.v0(i19, c6Var));
        ag.d dVar = new ag.d(context);
        mg.b bVar = new mg.b(i19, c6Var);
        lg.f fVar = new lg.f(cVar);
        fVar.n(bVar);
        fVar.o(AndroidUtilities.dp(8.0f));
        fVar.p(AndroidUtilities.dp(22.0f));
        dVar.setBackground(fVar);
        h7.b6.b(dVar, 0.02f, 1.2f);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7203r = frameLayout;
        FrameLayout.LayoutParams layoutParamsE = h7.z5.e(-1, 60, 87);
        layoutParamsE.bottomMargin += AndroidUtilities.navigationBarHeight;
        addView(frameLayout, layoutParamsE);
        frameLayout.addView(dVar, h7.z5.e(-2, 60, 1));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.C = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context);
        this.f7207y = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipToPadding(false);
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 24, 24));
        bp bpVar = new bp(context, 24, c6Var);
        this.B = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.f23126h7, org.telegram.ui.ActionBar.g6.f23163j7, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(false, false);
        bpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(bpVar, h7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.A = textView;
        rl.l(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2ChannelNotify));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        dVar.addView(linearLayout, h7.z5.d(-2, 38.0f, 17, 0.0f, 6.0f, 0.0f, 6.0f));
        h7.b6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new v2(wq0Var, n2Var, i10, i13));
        Boolean bool = m7VarG.h;
        if (bool != null) {
            bpVar.a(bool.booleanValue(), false);
        }
        TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(this.f7199c));
        boolean z10 = this.f7199c < 0 || !(user == null || UserObject.isUserSelf(user) || UserObject.isBot(user));
        StringBuilder sb2 = new StringBuilder("G ");
        if (z10) {
            long j11 = this.f7199c;
            if (j11 < 0) {
                i11 = R.string.ProfileGiftsSendChannel;
            } else {
                string = LocaleController.formatString(R.string.ProfileGiftsSendUser, DialogObject.getShortName(j11));
            }
            sb2.append(string);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(sb2.toString());
            spannableStringBuilder.setSpan(new cq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
            this.f7204s = spannableStringBuilder;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.y1.i(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
            spannableStringBuilder2.setSpan(new cq(R.drawable.filled_add_album, 0), 0, 1, 33);
            this.v = spannableStringBuilder2;
            lh.d dVar2 = new lh.d(context, c6Var, true);
            this.f7205w = dVar2;
            dVar2.setUseWrapContent(true);
            dVar2.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            dVar2.setRoundRadius(AndroidUtilities.dp(19.0f));
            dVar2.g(spannableStringBuilder, false, true);
            dVar2.setStateListAnimator(null);
            dVar.addView(dVar2, h7.z5.e(-2, -1, 17));
            dVar.setOnClickListener(new w2(wq0Var, z10, i10, i13));
            if (d()) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            dVar2.setVisibility(i12);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.f7206x = 60;
            addView(frameLayout2, h7.z5.e(-1, 200, 87));
            m();
            n();
        }
        i11 = R.string.ProfileGiftsSend;
        string = LocaleController.getString(i11);
        sb2.append(string);
        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(sb2.toString());
        spannableStringBuilder3.setSpan(new cq(R.drawable.filled_gift_simple, 0), 0, 1, 33);
        this.f7204s = spannableStringBuilder3;
        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(org.telegram.messenger.y1.i(R.string.ProfileGiftsAdd, new StringBuilder("+ ")));
        spannableStringBuilder4.setSpan(new cq(R.drawable.filled_add_album, 0), 0, 1, 33);
        this.v = spannableStringBuilder4;
        lh.d dVar3 = new lh.d(context, c6Var, true);
        this.f7205w = dVar3;
        dVar3.setUseWrapContent(true);
        dVar3.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        dVar3.setRoundRadius(AndroidUtilities.dp(19.0f));
        dVar3.g(spannableStringBuilder3, false, true);
        dVar3.setStateListAnimator(null);
        dVar.addView(dVar3, h7.z5.e(-2, -1, 17));
        dVar.setOnClickListener(new w2(wq0Var, z10, i10, i13));
        if (d()) {
            i12 = 8;
        } else {
            i12 = 0;
        }
        dVar3.setVisibility(i12);
        linearLayout.setVisibility(d() ? 0 : 8);
        this.f7206x = 60;
        addView(frameLayout2, h7.z5.e(-1, 200, 87));
        m();
        n();
    }

    public static void j(org.telegram.ui.ActionBar.f1 f1Var, m7 m7Var, Runnable runnable, int i10) {
        f1Var.setOnClickListener(new v2(m7Var, i10, runnable, 1));
        f1Var.setOnLongClickListener(new m2(m7Var, i10, runnable));
    }

    public final void a() {
        m7 m7Var;
        t3 currentPage = getCurrentPage();
        if (currentPage == null || (m7Var = currentPage.f7536e) == null || !currentPage.d) {
            return;
        }
        int i10 = m7Var.d;
        new y3(this.f7197a, this.f7199c, i10, new q2(this, i10, currentPage, 0)).show();
    }

    public final boolean b() {
        k7 k7Var = this.f7200e;
        return k7Var.h() && k7Var.d().size() < MessagesController.getInstance(this.f7198b).config.stargiftsCollectionsLimit.get();
    }

    public final boolean c() {
        int i10 = this.f7198b;
        long j10 = this.f7199c;
        if (j10 >= 0) {
            return j10 == 0 || j10 == UserConfig.getInstance(i10).getClientUserId();
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public final boolean d() {
        return this.f7199c < 0 && this.d.h != null;
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        int i12 = NotificationCenter.starUserGiftsLoaded;
        LinearLayout linearLayout = this.f7207y;
        lh.d dVar = this.f7205w;
        long j10 = this.f7199c;
        if (i10 == i12) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.f7206x = 60;
            Boolean bool = this.d.h;
            if (bool != null) {
                this.B.a(bool.booleanValue(), true);
                return;
            }
            return;
        }
        if (i10 == NotificationCenter.starUserGiftCollectionsLoaded) {
            if (((Long) objArr[0]).longValue() != j10) {
                return;
            }
            f(true);
            n();
            return;
        }
        if (i10 == NotificationCenter.updateInterfaces) {
            dVar.setVisibility(d() ? 8 : 0);
            linearLayout.setVisibility(d() ? 0 : 8);
            this.f7206x = 60;
            setVisibleHeight(this.M);
        }
    }

    public final void e() {
        TL_stars.TL_starGiftCollection tL_starGiftCollection;
        if (this.I <= 0) {
            return;
        }
        ArrayList arrayListD = this.f7200e.d();
        int i10 = 0;
        while (true) {
            if (i10 >= arrayListD.size()) {
                i10 = -1;
                tL_starGiftCollection = null;
                break;
            } else {
                if (((TL_stars.TL_starGiftCollection) arrayListD.get(i10)).collection_id == this.I) {
                    tL_starGiftCollection = (TL_stars.TL_starGiftCollection) arrayListD.get(i10);
                    break;
                }
                i10++;
            }
        }
        if (i10 < 0 || tL_starGiftCollection == null) {
            return;
        }
        this.I = 0;
        this.f7202n.d(tL_starGiftCollection.collection_id, i10 + 1);
    }

    public final void f(boolean z10) {
        x2 x2Var = this.h;
        if (x2Var == null || this.f7202n == null) {
            return;
        }
        x2Var.o(z10);
        e();
    }

    public final boolean g() {
        if (this.H) {
            return true;
        }
        t3 currentPage = getCurrentPage();
        return currentPage != null && currentPage.f7538n;
    }

    public int getBottomOffset() {
        FrameLayout frameLayout = this.f7203r;
        float translationY = frameLayout.getTranslationY() - org.telegram.messenger.y1.B(this.f7206x, Math.max(AndroidUtilities.dp(240.0f), this.M) + (-frameLayout.getTop()), 1);
        if (this.M < AndroidUtilities.dp(240.0f)) {
            translationY += Math.min(AndroidUtilities.dp(240.0f) - this.M, AndroidUtilities.dp(this.f7206x));
        }
        return (int) (AndroidUtilities.dp(this.f7206x) - translationY);
    }

    public m7 getCurrentList() {
        t3 currentPage = getCurrentPage();
        return currentPage != null ? currentPage.f7536e : this.d;
    }

    public zk0 getCurrentListView() {
        t3 currentPage = getCurrentPage();
        if (currentPage != null) {
            return currentPage.f7537f;
        }
        return null;
    }

    public t3 getCurrentPage() {
        View currentView = this.h.getCurrentView();
        if (currentView == null) {
            return null;
        }
        return (t3) currentView;
    }

    public int getGiftsCount() {
        int i10;
        m7 m7Var;
        int i11;
        t3 currentPage = getCurrentPage();
        m7 m7Var2 = this.d;
        if (currentPage == null || (m7Var = currentPage.f7536e) == m7Var2) {
            if (m7Var2 != null && (i10 = m7Var2.f9755n) > 0) {
                return i10;
            }
        } else if (m7Var != null && (i11 = m7Var.f9755n) > 0) {
            return i11;
        }
        int i12 = this.f7198b;
        long j10 = this.f7199c;
        if (j10 >= 0) {
            TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
            if (userFull != null) {
                return userFull.stargifts_count;
            }
            return 0;
        }
        TLRPC.ChatFull chatFull = MessagesController.getInstance(i12).getChatFull(-j10);
        if (chatFull != null) {
            return chatFull.stargifts_count;
        }
        return 0;
    }

    public long getLastEmojisHash() {
        long jHash = 0;
        m7 m7Var = this.d;
        if (m7Var != null && !m7Var.f9753l.isEmpty()) {
            HashSet hashSet = new HashSet();
            int i10 = 0;
            for (int i11 = 0; i10 < 3 && i11 < m7Var.f9753l.size(); i11++) {
                TLRPC.Document document = ((TL_stars.SavedStarGift) m7Var.f9753l.get(i11)).gift.getDocument();
                if (document != null) {
                    hashSet.add(Long.valueOf(document.f22386id));
                    jHash = Objects.hash(Long.valueOf(jHash), Long.valueOf(document.f22386id));
                    i10++;
                }
            }
        }
        return jHash;
    }

    public float getTabsHeight() {
        x2 x2Var = this.h;
        float tabsHeight = 0.0f;
        if (x2Var.getViewPages() != null) {
            for (View view : x2Var.getViewPages()) {
                if (view instanceof t3) {
                    tabsHeight = (((t3) view).getTabsHeight() * (1.0f - (view.getTranslationX() / view.getWidth()))) + tabsHeight;
                }
            }
        }
        return tabsHeight;
    }

    public float getTabsVisibility() {
        o71 o71Var = this.f7202n;
        if (o71Var != null) {
            return o71Var.getAlpha();
        }
        return 0.0f;
    }

    public final void h(String str, Utilities.Callback callback) {
        w60 w60Var;
        Context context = getContext();
        Activity activityFindActivity = AndroidUtilities.findActivity(context);
        View currentFocus = activityFindActivity != null ? activityFindActivity.getCurrentFocus() : null;
        org.telegram.ui.ActionBar.b2[] b2VarArr = new org.telegram.ui.ActionBar.b2[1];
        org.telegram.ui.ActionBar.c6 c6Var = this.f7201f;
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, c6Var);
        if (str != null) {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2EditCollectionNameTitle);
        } else {
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2NewCollectionTitle);
            alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.Gift2NewCollectionText);
        }
        b3 b3Var = new b3(this, context, c6Var);
        b3Var.lineYFix = true;
        b3Var.setOnEditorActionListener(new c3(b3Var, callback, b2VarArr, currentFocus));
        MediaDataController.getInstance(this.f7198b).fetchNewEmojiKeywords(AndroidUtilities.getCurrentKeyboardLanguage(), true);
        b3Var.setTextSize(1, 18.0f);
        b3Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        b3Var.setHintColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Xh, c6Var));
        b3Var.setHintText(LocaleController.getString(R.string.Gift2NewCollectionHint));
        b3Var.setFocusable(true);
        b3Var.setInputType(147457);
        b3Var.setLineColors(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23181k6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23198l6, c6Var), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23269p7, c6Var));
        b3Var.setImeOptions(6);
        b3Var.setBackgroundDrawable(null);
        b3Var.setPadding(0, AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        b3Var.addTextChangedListener(new d3(b3Var));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        b3Var.setText(str);
        linearLayout.addView(b3Var, h7.z5.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.f22702a.f22742a = AndroidUtilities.dp(292.0f);
        alertDialog$Builder.k(LocaleController.getString(str != null ? R.string.Edit : R.string.Create), new ag.h0(18, b3Var, callback));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f9.z(10));
        b2VarArr[0] = alertDialog$Builder.f22702a;
        b70 b70Var = this.E;
        if (b70Var != null && (w60Var = b70Var.f26982m) != null) {
            w60Var.setSoftInputMode(48);
        }
        AndroidUtilities.requestAdjustNothing(activityFindActivity, this.f7197a.getClassGuid());
        int i10 = 1;
        b2VarArr[0].setOnDismissListener(new j(this, b3Var, activityFindActivity, i10));
        b2VarArr[0].setOnShowListener(new k(i10, b3Var));
        b2VarArr[0].show();
        org.telegram.ui.ActionBar.b2 b2Var = b2VarArr[0];
        b2Var.f22748d0 = false;
        b2Var.d(-1);
        b3Var.setSelection(b3Var.getText().length());
    }

    public final void i() {
        t3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.e();
        }
        setReorderingCollections(false);
    }

    public final boolean k(int i10) {
        if (i10 == 0) {
            return false;
        }
        int i11 = i10 - 1;
        if (i11 >= 0) {
            k7 k7Var = this.f7200e;
            if (i11 < k7Var.d().size()) {
                m7 m7VarE = (i11 < 0 || i11 >= k7Var.d().size()) ? null : k7Var.e(((TL_stars.TL_starGiftCollection) k7Var.d().get(i11)).collection_id);
                if (m7VarE != null) {
                    return m7VarE.f9753l.isEmpty();
                }
            }
        }
        return true;
    }

    public final void l() {
        float nextPositionAlpha;
        jb jbVar;
        x2 x2Var = this.h;
        if (x2Var == null) {
            return;
        }
        if (x2Var.getCurrentPosition() == x2Var.getNextPosition()) {
            nextPositionAlpha = (AndroidUtilities.dp(68.0f) + 2) * (k(x2Var.getCurrentPosition()) ? 1.0f : 0.0f);
        } else {
            nextPositionAlpha = ((x2Var.getNextPositionAlpha() * (k(x2Var.getNextPosition()) ? 1.0f : 0.0f)) + (x2Var.getCurrentPositionAlpha() * (k(x2Var.getCurrentPosition()) ? 1.0f : 0.0f))) * (AndroidUtilities.dp(68.0f) + 2);
        }
        FrameLayout frameLayout = this.f7203r;
        float fB = nextPositionAlpha + org.telegram.messenger.y1.B(this.f7206x, (-frameLayout.getTop()) + this.M, 1);
        boolean z10 = this.M > AndroidUtilities.dp(184.0f);
        ud.a aVar = this.K;
        aVar.a(z10, true);
        float f10 = aVar.f48497e;
        float fLerp = AndroidUtilities.lerp(AndroidUtilities.dp(60.0f) + fB, fB, f10);
        this.C.setTranslationY(fLerp - AndroidUtilities.dp(200.0f));
        frameLayout.setTranslationY(fLerp - this.L);
        frameLayout.setAlpha(f10);
        frameLayout.setVisibility(f10 <= 0.0f ? 4 : 0);
        this.f7205w.g((!this.f7200e.h() || x2Var.getPositionAnimated() < 0.5f) ? this.f7204s : this.v, true, true);
        ec ecVar = ec.f28012w;
        if (ecVar == null || (jbVar = ecVar.f28016e) == null) {
            return;
        }
        jbVar.updatePosition();
    }

    public final void m() {
        lh.d dVar = this.f7205w;
        dVar.j();
        int iDp = AndroidUtilities.dp(19.0f);
        int i10 = org.telegram.ui.ActionBar.g6.Oh;
        org.telegram.ui.ActionBar.c6 c6Var = this.f7201f;
        dVar.setBackground(org.telegram.ui.ActionBar.g6.b0(iDp, ((wq0) this).Q.V0(org.telegram.ui.ActionBar.g6.v0(i10, c6Var))));
        View[] viewPages = this.h.getViewPages();
        if (viewPages != null) {
            for (View view : viewPages) {
                if (view != null) {
                    t3 t3Var = (t3) view;
                    org.telegram.ui.ActionBar.c6 c6Var2 = t3Var.f7535c;
                    if (t3Var.f7540s != null) {
                        t3Var.f7541w.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
                        TextView textView = t3Var.f7542x;
                        int i11 = org.telegram.ui.ActionBar.g6.Oh;
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i11, c6Var2));
                        t3Var.f7542x.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i11, c6Var2)), 4, 4));
                    } else {
                        t3Var.B.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, c6Var2));
                        t3Var.C.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23423y6, c6Var2));
                        t3Var.D.j();
                    }
                }
            }
        }
        this.A.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, c6Var));
        this.f7207y.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 24, 24));
    }

    public final void n() {
        boolean z10 = !this.f7200e.d().isEmpty() || b();
        x2 x2Var = this.h;
        if (x2Var.getViewPages() != null) {
            for (View view : x2Var.getViewPages()) {
                if (view instanceof t3) {
                    ((t3) view).setHasTabs(z10);
                }
            }
        }
    }

    public final void o() {
        float f10;
        o71 o71Var = this.f7202n;
        if (o71Var == null) {
            return;
        }
        float fMin = Math.min(this.G, getTabsHeight() - AndroidUtilities.dp(42.0f));
        float fClamp01 = Utilities.clamp01(AndroidUtilities.ilerp(fMin - this.G, -AndroidUtilities.dp(42.0f), 0.0f));
        float fLerp = AndroidUtilities.lerp(0.9f, 1.0f, fClamp01);
        o71Var.setTranslationY(fMin);
        o71Var.setScaleX(fLerp);
        o71Var.setScaleY(fLerp);
        x2 x2Var = this.h;
        if (x2Var.getViewPages() != null) {
            f10 = 0.0f;
            for (View view : x2Var.getViewPages()) {
                if (view instanceof t3) {
                    f10 += ((t3) view).E ? 1.0f : 0.0f;
                }
            }
        } else {
            f10 = 0.0f;
        }
        o71Var.setAlpha(h7.n.a(f10, 0.0f, 1.0f) * fClamp01);
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        int i10 = this.f7198b;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.updateInterfaces);
        t3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.f(false);
        }
        f(false);
        n();
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.f9756o = true;
            m7Var.a();
        }
        k7 k7Var = this.f7200e;
        if (k7Var != null) {
            k7Var.f9618j = true;
            k7Var.i();
        }
    }

    @Override
    public final void onDetachedFromWindow() {
        t3 currentPage = getCurrentPage();
        i();
        if (currentPage != null) {
            currentPage.e();
        }
        super.onDetachedFromWindow();
        int i10 = this.f7198b;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftCollectionsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.updateInterfaces);
        m7 m7Var = this.d;
        if (m7Var != null) {
            m7Var.f9756o = false;
        }
        k7 k7Var = this.f7200e;
        if (k7Var != null) {
            k7Var.f9618j = false;
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
        if (this.G != i10) {
            this.G = i10;
            for (View view : this.h.getViewPages()) {
                if (view instanceof t3) {
                    t3 t3Var = (t3) view;
                    n3 n3Var = t3Var.f7537f;
                    int paddingTop = n3Var.getPaddingTop();
                    n3Var.setPadding(AndroidUtilities.dp(9.0f), this.G, AndroidUtilities.dp(9.0f), AndroidUtilities.dp(86.0f));
                    AndroidUtilities.doOnLayout(n3Var, new r2(t3Var, paddingTop - n3Var.getPaddingTop(), 0));
                }
            }
            o();
            l();
        }
    }

    public void setReordering(boolean z10) {
        t3 currentPage = getCurrentPage();
        if (currentPage != null) {
            currentPage.setReordering(z10);
        }
    }

    public void setReorderingCollections(boolean z10) {
        if (this.H == z10) {
            return;
        }
        this.H = z10;
        p(g());
        this.f7202n.setReordering(z10);
        if (z10) {
            org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
            if (n2VarU instanceof ProfileActivity) {
                ProfileActivity profileActivity = (ProfileActivity) n2VarU;
                profileActivity.G4(false);
                AndroidUtilities.runOnUIThread(new l2(profileActivity, 0));
            }
        }
        if (z10) {
            return;
        }
        o2 o2Var = this.J;
        AndroidUtilities.cancelRunOnUIThread(o2Var);
        AndroidUtilities.runOnUIThread(o2Var);
    }

    public void setVisibleHeight(int i10) {
        this.M = i10;
        l();
        x2 x2Var = this.h;
        if (x2Var != null) {
            for (View view : x2Var.getViewPages()) {
                if (view instanceof t3) {
                    ((t3) view).setVisibleHeight(this.M);
                }
            }
        }
    }
}
