package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.io.File;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.aw;
import org.telegram.ui.Components.i80;
import org.telegram.ui.Components.od0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.sn;
public final class p implements View.OnClickListener {
    public final int f1991a;
    public final Object f1992b;
    public final Object f1993c;

    public p(int i10, Object obj, Object obj2) {
        this.f1991a = i10;
        this.f1993c = obj;
        this.f1992b = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        ci.i4 i4Var;
        int i10 = this.f1991a;
        v1 v1Var = null;
        CharSequence charSequence = null;
        v1Var = null;
        Object obj = this.f1992b;
        Object obj2 = this.f1993c;
        switch (i10) {
            case 0:
                x.X((x) obj2, (Context) obj, view);
                return;
            case 1:
                b1 b1Var = (b1) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int[] iArr = b1.f996w0;
                    if (i11 < 6) {
                        strArr[i11] = LocaleController.formatPluralString("GiftOfferHours", iArr[i11] / 3600, new Object[0]);
                        if (iArr[i11] == b1Var.f1009n0) {
                            i12 = i11;
                        }
                        i11++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        r0 r0Var = new r0(b1Var, 0);
                        Pattern pattern = org.telegram.ui.Components.f5.f26080a;
                        ig.f2 b10 = ig.f2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21092j5, false);
                            int x03 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21057h5, false);
                            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ji, false);
                            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Ni, false);
                            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.E8, false);
                            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.G8, false);
                            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21075i6, false);
                            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Sh, false);
                            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Oh, false);
                            org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.Qh, false);
                            org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, context, (org.telegram.ui.ActionBar.d6) null, false);
                            f3Var.fixNavigationBar();
                            f3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            od0 od0Var = new od0(context, null);
                            od0Var.setAllItemsCount(6);
                            od0Var.setItemCount(Math.min(6, 8));
                            od0Var.setTextColor(x02);
                            od0Var.setGravity(17);
                            od0Var.setMinValue(0);
                            od0Var.setMaxValue(5);
                            od0Var.setValue(i12);
                            linearLayout.addView(od0Var, w7.z5.l(1.0f, 0, 432));
                            od0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.x4 x4Var = new org.telegram.ui.Components.x4(context, od0Var);
                            x4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, w7.z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new di.d(10));
                            x4Var.addView(frameLayout, w7.z5.t(-1, -2, 51, 22, 0, 0, 4));
                            x4Var.addView(linearLayout, w7.z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            ei.d dVar = new ei.d(context, null, true);
                            dVar.g(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.l2(r2, 1));
                            x4Var.addView(dVar, w7.z5.t(-1, 48, 0, 16, 12, 16, 12));
                            f3Var.customView = x4Var;
                            f3Var.show();
                            f3Var.setOnDismissListener(new x3(9, r0Var, od0Var));
                            f3Var.setBackgroundColor(x03);
                            f3Var.fixNavigationBar(x03);
                            org.telegram.ui.ActionBar.f3[] f3VarArr = {f3Var};
                            return;
                        }
                        return;
                    }
                }
            case 2:
                l1 l1Var = (l1) obj2;
                n2 n2Var = (n2) obj;
                ei.d dVar2 = l1Var.f1746f;
                if (dVar2.W && !dVar2.N) {
                    AndroidUtilities.hideKeyboard(l1Var.f1745c);
                    dVar2.setLoading(true);
                    n2Var.run(l1Var.E);
                    return;
                }
                return;
            case 3:
                a2 a2Var = (a2) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj;
                s1 s1Var = a2Var.f940o0;
                int i13 = a2Var.C0;
                if (i13 == 2) {
                    s1Var.setPreviewingAttributes(arrayList);
                    a2Var.T(1);
                    return;
                } else if (i13 == 1) {
                    v1 v1Var2 = new v1(s1Var.getUpgradeBackdropAttribute(), s1Var.getUpgradePatternAttribute(), s1Var.getUpgradeImageViewAttribute());
                    a2Var.f947v0 = v1Var2;
                    s1Var.setPreviewAttributes(v1Var2);
                    a2Var.T(2);
                    return;
                } else {
                    return;
                }
            case 4:
                v1 v1Var3 = (v1) obj;
                a2 a2Var2 = ((t1) obj2).N;
                int i14 = a2Var2.C0;
                s1 s1Var2 = a2Var2.f940o0;
                if (i14 == 1) {
                    a2Var2.f947v0 = new v1(s1Var2.getUpgradeBackdropAttribute(), s1Var2.getUpgradePatternAttribute(), s1Var2.getUpgradeImageViewAttribute());
                    a2Var2.T(2);
                }
                int i15 = a2Var2.f936j0.f2522r;
                v1 v1Var4 = a2Var2.f947v0;
                if (v1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = v1Var4.f2286a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = v1Var4.f2288c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = v1Var4.f2287b;
                    if (i15 == 1) {
                        v1Var = new v1(v1Var3.f2286a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i15 == 2) {
                        v1Var = new v1(stargiftattributebackdrop, v1Var3.f2287b, stargiftattributemodel);
                    } else if (i15 == 0) {
                        v1Var = new v1(stargiftattributebackdrop, stargiftattributepattern, v1Var3.f2288c);
                    }
                }
                a2Var2.f947v0 = v1Var;
                s1Var2.setPreviewAttributes(v1Var);
                a2Var2.V();
                return;
            case 5:
                k7 k7Var = (k7) obj2;
                boolean z10 = !k7Var.f1702x1;
                k7Var.f1702x1 = z10;
                ((org.telegram.ui.Cells.a2) obj).c(z10, true);
                return;
            case 6:
                pf.d.t(((k7) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                return;
            case 7:
                ((k7) obj2).K2((CharSequence) obj);
                return;
            case 8:
                d6 d6Var = (d6) obj2;
                org.telegram.ui.ActionBar.d6 d6Var2 = (org.telegram.ui.ActionBar.d6) obj;
                if (d6Var.E.getAlpha() >= 1.0f && !d6Var.f1152h0 && !d6Var.f1154j0 && d6Var.f1147d0 != null) {
                    new a2(d6Var.getContext(), d6Var2, d6Var.W, d6Var.f1146c0, d6Var.f1147d0, true).show();
                    return;
                }
                return;
            case 9:
                pf.d.r((Context) obj, ((TL_stars.StarsTransaction) obj2).transaction_url);
                return;
            case 10:
                ci.h1 h1Var = (ci.h1) obj2;
                Context context2 = (Context) obj;
                if (h1Var != null) {
                    int i16 = h1Var.e;
                    if (i16 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.H1;
                        if (launchActivity != null) {
                            launchActivity.O0(i16);
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i16).getStoriesController().u(h1Var.f5379c, h1Var.f5378b);
                        if (u10 == null) {
                            u10 = h1Var.f5377a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().A(i16, context2, u10, null);
                            AndroidUtilities.runOnUIThread(new ah.j(6), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                ci.p4 p4Var = (ci.p4) obj2;
                ci.m8 m8Var = (ci.m8) obj;
                ci.z9 z9Var = p4Var.J0;
                if (m8Var.f5561b != null) {
                    Bundle bundle = new Bundle();
                    if (m8Var.f5561b.longValue() >= 0) {
                        bundle.putLong("user_id", m8Var.f5561b.longValue());
                    } else {
                        bundle.putLong("chat_id", -m8Var.f5561b.longValue());
                    }
                    if (m8Var.e && (num = m8Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        z9Var.H(new sn(bundle));
                        return;
                    }
                    z9Var.H(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.qc Q = new org.telegram.ui.Components.xc(p4Var.f5652c1, p4Var.B0).Q(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                Q.f29632a = 3;
                Q.k(true);
                return;
            case 12:
                ci.p4 p4Var2 = (ci.p4) obj2;
                ((ci.q9) p4Var2.Q1).h(new sg.y0(p4Var2.J0.f6222f, 14, false));
                ((org.telegram.ui.ActionBar.f3) obj).dismiss();
                return;
            case 13:
                ci.p4 p4Var3 = ((ci.g4) obj2).f5357l;
                aw alert = ((ci.u8) obj).getAlert();
                if (alert != null && (i4Var = p4Var3.Q1) != null) {
                    ((ci.q9) i4Var).h(alert);
                    p4Var3.f5704t1.a();
                    return;
                }
                return;
            case 14:
                ei.q3 q3Var = (ei.q3) obj2;
                q3Var.e((MediaController.AlbumEntry) obj, false);
                q3Var.F.n();
                return;
            case 15:
                ei.j8 j8Var = (ei.j8) obj2;
                ei.p6 p6Var = (ei.p6) obj;
                org.telegram.ui.Cells.i3 i3Var = j8Var.Y;
                try {
                    charSequence = ((ClipboardManager) j8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(j8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (charSequence != null) {
                    i3Var.f22398b.setText(charSequence.toString());
                    org.telegram.ui.Cells.g3 g3Var = i3Var.f22398b;
                    g3Var.setSelection(0, g3Var.getText().length());
                }
                p6Var.run();
                return;
            case 16:
                ei.vb vbVar = (ei.vb) obj2;
                new ei.t8((Context) obj, vbVar.f9955c, true, vbVar.f10023x0, new ei.u9(vbVar, 20), vbVar.f9948a).show();
                return;
            case 17:
                gi.l.y0((gi.l) obj2, (Context) obj);
                return;
            case 18:
                gi.d3 d3Var = (gi.d3) obj2;
                gi.i0 i0Var = (gi.i0) obj;
                if (i0Var.c()) {
                    i0Var.a();
                } else {
                    File file = i0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = i0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.H1, null, true);
                    }
                }
                i80 i80Var = d3Var.K0;
                if (i80Var != null) {
                    i80Var.u();
                    d3Var.K0 = null;
                    return;
                }
                return;
            case 19:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.f3) obj2).dismiss();
                org.telegram.ui.ActionBar.n2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.m4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 20:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) obj2).link);
                org.telegram.ui.Components.xc.a0((sn) obj).k(false).j();
                return;
            case 21:
                ig.k0.R((ig.k0) obj2, (TL_account.TL_connectedBot) obj);
                return;
            case 22:
                ji.b bVar = (ji.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                return;
            case 23:
                ki.d2.Y((ki.d2) obj2, (Context) obj, view);
                return;
            case 24:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                return;
            case 25:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 26:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.t0 t0Var = (org.telegram.ui.ActionBar.t0) obj;
                int indexOf = u0Var.f21736g0.indexOf(t0Var.getFilter());
                if (u0Var.f21737h0 != indexOf) {
                    u0Var.f21737h0 = indexOf;
                    u0Var.y();
                    return;
                } else if (t0Var.getFilter().h) {
                    if (!t0Var.f21711a.f17383f) {
                        t0Var.setSelectedForDelete(true);
                        return;
                    }
                    hg.o0 filter = t0Var.getFilter();
                    u0Var.C(filter);
                    org.telegram.ui.ActionBar.g5 g5Var = u0Var.H;
                    if (g5Var != null) {
                        g5Var.o(filter);
                        u0Var.H.q(u0Var.e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 27:
                org.telegram.ui.ActionBar.s0 s0Var = (org.telegram.ui.ActionBar.s0) obj2;
                org.telegram.ui.ActionBar.u0 u0Var2 = (org.telegram.ui.ActionBar.u0) obj;
                org.telegram.ui.ActionBar.m1 m1Var = u0Var2.d;
                if (m1Var != null && m1Var.isShowing() && s0Var.f21692f) {
                    if (!u0Var2.T) {
                        u0Var2.T = true;
                        u0Var2.d.d(u0Var2.R);
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = u0Var2.f21730c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.q0 q0Var = u0Var2.P;
                if (q0Var != null) {
                    q0Var.j(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 28:
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                if (!((org.telegram.ui.ActionBar.w1) obj).f21545a) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = b2Var.m0;
                    if (a2Var3 != null) {
                        a2Var3.g(b2Var, -1);
                    }
                    if (b2Var.f20662h0) {
                        b2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.b2 b2Var2 = (org.telegram.ui.ActionBar.b2) obj2;
                if (!((org.telegram.ui.ActionBar.w1) obj).f21545a) {
                    org.telegram.ui.ActionBar.a2 a2Var4 = b2Var2.f20669o0;
                    if (a2Var4 != null) {
                        a2Var4.g(b2Var2, -2);
                    }
                    if (b2Var2.f20662h0) {
                        b2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public p(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f1991a = 9;
        this.f1992b = context;
        this.f1993c = starsTransaction;
    }
}
