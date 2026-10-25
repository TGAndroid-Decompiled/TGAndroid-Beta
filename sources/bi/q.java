package bi;

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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k80;
import org.telegram.ui.Components.md0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.un;
public final class q implements View.OnClickListener {
    public final int f5254a;
    public final Object f5255b;
    public final Object f5256c;

    public q(int i10, Object obj, Object obj2) {
        this.f5254a = i10;
        this.f5256c = obj;
        this.f5255b = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        di.j4 j4Var;
        int i10 = this.f5254a;
        s1 s1Var = null;
        CharSequence charSequence = null;
        s1Var = null;
        Object obj = this.f5255b;
        Object obj2 = this.f5256c;
        switch (i10) {
            case 0:
                y.Y((y) obj2, (Context) obj, view);
                return;
            case 1:
                b1 b1Var = (b1) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i11 = 0;
                int i12 = 0;
                while (true) {
                    int[] iArr = b1.f4305x0;
                    if (i11 < 6) {
                        strArr[i11] = LocaleController.formatPluralString("GiftOfferHours", iArr[i11] / 3600, new Object[0]);
                        if (iArr[i11] == b1Var.f4319o0) {
                            i12 = i11;
                        }
                        i11++;
                    } else {
                        String string = LocaleController.getString(R.string.GiftOfferDuration);
                        ai.i iVar = new ai.i(b1Var, 4);
                        Pattern pattern = org.telegram.ui.Components.g5.f28418a;
                        jg.g2 b10 = jg.g2.b(UserConfig.selectedAccount);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23462j5, false);
                            int x03 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23425h5, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ji, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Ni, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.E8, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.G8, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23446i6, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Sh, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Oh, false);
                            org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.Qh, false);
                            org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, context, (org.telegram.ui.ActionBar.u6) null, false);
                            k3Var.fixNavigationBar();
                            k3Var.applyBottomPadding = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            md0 md0Var = new md0(context, null);
                            md0Var.setAllItemsCount(6);
                            md0Var.setItemCount(Math.min(6, 8));
                            md0Var.setTextColor(x02);
                            md0Var.setGravity(17);
                            md0Var.setMinValue(0);
                            md0Var.setMaxValue(5);
                            md0Var.setValue(i12);
                            linearLayout.addView(md0Var, gb1.p(1.0f, 0, 432));
                            md0Var.setFormatter(new org.telegram.ui.Components.s(strArr, 7));
                            org.telegram.ui.Components.x4 x4Var = new org.telegram.ui.Components.x4(context, md0Var);
                            x4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(string);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(AndroidUtilities.bold());
                            frameLayout.addView(textView, gb1.h(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ei.d(10));
                            x4Var.addView(frameLayout, gb1.x(-1, -2, 51, 22, 0, 0, 4));
                            x4Var.addView(linearLayout, gb1.t(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            fi.d dVar = new fi.d(context, null, true);
                            dVar.i(LocaleController.getString(R.string.Select), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.n2(r2, 1));
                            x4Var.addView(dVar, gb1.x(-1, 48, 0, 16, 12, 16, 12));
                            k3Var.customView = x4Var;
                            k3Var.show();
                            k3Var.setOnDismissListener(new u3(9, iVar, md0Var));
                            k3Var.setBackgroundColor(x03);
                            k3Var.fixNavigationBar(x03);
                            org.telegram.ui.ActionBar.k3[] k3VarArr = {k3Var};
                            return;
                        }
                        return;
                    }
                }
            case 2:
                k1 k1Var = (k1) obj2;
                ai.n1 n1Var = (ai.n1) obj;
                fi.d dVar2 = k1Var.f4935f;
                if (dVar2.f10687c0 && !dVar2.Q) {
                    AndroidUtilities.hideKeyboard(k1Var.f4934c);
                    dVar2.setLoading(true);
                    n1Var.run(k1Var.E);
                    return;
                }
                return;
            case 3:
                x1 x1Var = (x1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj;
                p1 p1Var = x1Var.f5655o0;
                int i13 = x1Var.f5666z0;
                if (i13 == 2) {
                    p1Var.setPreviewingAttributes(arrayList);
                    x1Var.T(1);
                    return;
                } else if (i13 == 1) {
                    s1 s1Var2 = new s1(p1Var.getUpgradeBackdropAttribute(), p1Var.getUpgradePatternAttribute(), p1Var.getUpgradeImageViewAttribute());
                    x1Var.f5660t0 = s1Var2;
                    p1Var.setPreviewAttributes(s1Var2);
                    x1Var.T(2);
                    return;
                } else {
                    return;
                }
            case 4:
                s1 s1Var3 = (s1) obj;
                x1 x1Var2 = ((q1) obj2).P;
                int i14 = x1Var2.f5666z0;
                p1 p1Var2 = x1Var2.f5655o0;
                if (i14 == 1) {
                    x1Var2.f5660t0 = new s1(p1Var2.getUpgradeBackdropAttribute(), p1Var2.getUpgradePatternAttribute(), p1Var2.getUpgradeImageViewAttribute());
                    x1Var2.T(2);
                }
                int i15 = x1Var2.f5651j0.f5593s;
                s1 s1Var4 = x1Var2.f5660t0;
                if (s1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = s1Var4.f5384a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = s1Var4.f5386c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = s1Var4.f5385b;
                    if (i15 == 1) {
                        s1Var = new s1(s1Var3.f5384a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i15 == 2) {
                        s1Var = new s1(stargiftattributebackdrop, s1Var3.f5385b, stargiftattributemodel);
                    } else if (i15 == 0) {
                        s1Var = new s1(stargiftattributebackdrop, stargiftattributepattern, s1Var3.f5386c);
                    }
                }
                x1Var2.f5660t0 = s1Var;
                p1Var2.setPreviewAttributes(s1Var);
                x1Var2.V();
                return;
            case 5:
                h7 h7Var = (h7) obj2;
                boolean z10 = !h7Var.f4772x1;
                h7Var.f4772x1 = z10;
                ((org.telegram.ui.Cells.y1) obj).c(z10, true);
                return;
            case 6:
                qf.d.t(((h7) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url);
                return;
            case 7:
                ((h7) obj2).Q2((CharSequence) obj);
                return;
            case 8:
                z5 z5Var = (z5) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                if (z5Var.E.getAlpha() >= 1.0f && !z5Var.f5839h0 && !z5Var.f5841j0 && z5Var.f5834d0 != null) {
                    new x1(z5Var.getContext(), u6Var, z5Var.W, z5Var.f5833c0, z5Var.f5834d0, true).show();
                    return;
                }
                return;
            case 9:
                qf.d.r((Context) obj, ((TL_stars.StarsTransaction) obj2).transaction_url);
                return;
            case 10:
                di.h1 h1Var = (di.h1) obj2;
                Context context2 = (Context) obj;
                if (h1Var != null) {
                    int i16 = h1Var.e;
                    if (i16 != UserConfig.selectedAccount) {
                        LaunchActivity launchActivity = LaunchActivity.I1;
                        if (launchActivity != null) {
                            launchActivity.P0(i16);
                        } else {
                            return;
                        }
                    }
                    org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
                    if (U != null) {
                        TL_stories.StoryItem u10 = MessagesController.getInstance(i16).getStoriesController().u(h1Var.f8606c, h1Var.f8605b);
                        if (u10 == null) {
                            u10 = h1Var.f8604a;
                        }
                        if (u10 != null) {
                            U.getOrCreateStoryViewer().A(i16, context2, u10, null);
                            AndroidUtilities.runOnUIThread(new ag.c(9), 200L);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 11:
                di.q4 q4Var = (di.q4) obj2;
                di.k8 k8Var = (di.k8) obj;
                di.y9 y9Var = q4Var.f9047y0;
                if (k8Var.f8729b != null) {
                    Bundle bundle = new Bundle();
                    if (k8Var.f8729b.longValue() >= 0) {
                        bundle.putLong("user_id", k8Var.f8729b.longValue());
                    } else {
                        bundle.putLong("chat_id", -k8Var.f8729b.longValue());
                    }
                    if (k8Var.e && (num = k8Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        y9Var.H(new un(bundle));
                        return;
                    }
                    y9Var.H(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.qc R = new org.telegram.ui.Components.wc(q4Var.R0, q4Var.f9015q0).R(R.raw.error, 36, LocaleController.getString(R.string.StoryHidAccount));
                R.f31881a = 3;
                R.k(true);
                return;
            case 12:
                di.q4 q4Var2 = (di.q4) obj2;
                ((di.p9) q4Var2.F1).h(new tg.y0(q4Var2.f9047y0.f9429f, 14, false));
                ((org.telegram.ui.ActionBar.k3) obj).dismiss();
                return;
            case 13:
                di.q4 q4Var3 = ((di.h4) obj2).f8626l;
                aw alert = ((di.t8) obj).getAlert();
                if (alert != null && (j4Var = q4Var3.F1) != null) {
                    ((di.p9) j4Var).h(alert);
                    q4Var3.f8988i1.a();
                    return;
                }
                return;
            case 14:
                fi.o3 o3Var = (fi.o3) obj2;
                o3Var.e((MediaController.AlbumEntry) obj, false);
                o3Var.F.o();
                return;
            case 15:
                fi.f8 f8Var = (fi.f8) obj2;
                e2.q0 q0Var = (e2.q0) obj;
                org.telegram.ui.Cells.g3 g3Var = f8Var.Y;
                try {
                    charSequence = ((ClipboardManager) f8Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(f8Var.getContext());
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (charSequence != null) {
                    g3Var.d.setText(charSequence.toString());
                    org.telegram.ui.Cells.e3 e3Var = g3Var.d;
                    e3Var.setSelection(0, e3Var.getText().length());
                }
                q0Var.run();
                return;
            case 16:
                fi.sb sbVar = (fi.sb) obj2;
                new fi.p8((Context) obj, sbVar.f11612c, true, sbVar.f11680x0, new fi.q9(sbVar, 20), sbVar.f11605a).show();
                return;
            case 17:
                hi.k.w0((hi.k) obj2, (Context) obj);
                return;
            case 18:
                hi.m3 m3Var = (hi.m3) obj2;
                hi.p0 p0Var = (hi.p0) obj;
                if (p0Var.c()) {
                    p0Var.a();
                } else {
                    File file = p0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = p0Var.d;
                        AndroidUtilities.openForView(file2, file2.getName(), null, LaunchActivity.I1, null, true);
                    }
                }
                k80 k80Var = m3Var.O0;
                if (k80Var != null) {
                    k80Var.u();
                    m3Var.O0 = null;
                    return;
                }
                return;
            case 19:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.k3) obj2).dismiss();
                org.telegram.ui.ActionBar.r2 U2 = LaunchActivity.U();
                if (U2 != null) {
                    U2.presentFragment(ProfileActivity.t4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 20:
                AndroidUtilities.addToClipboard(((TL_account.TL_businessChatLink) obj2).link);
                org.telegram.ui.Components.wc.b0((un) obj).k(false).j();
                return;
            case 21:
                jg.k0.Q((jg.k0) obj2, (TL_account.TL_connectedBot) obj);
                return;
            case 22:
                ki.b bVar = (ki.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                return;
            case 23:
                li.b2.Y((li.b2) obj2, (Context) obj, view);
                return;
            case 24:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                return;
            case 25:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 26:
                org.telegram.ui.ActionBar.w0 w0Var = (org.telegram.ui.ActionBar.w0) obj2;
                org.telegram.ui.ActionBar.v0 v0Var = (org.telegram.ui.ActionBar.v0) obj;
                int indexOf = w0Var.f23182g0.indexOf(v0Var.getFilter());
                if (w0Var.f23183h0 != indexOf) {
                    w0Var.f23183h0 = indexOf;
                    w0Var.D();
                    return;
                } else if (v0Var.getFilter().h) {
                    if (!v0Var.f23142a.f19327f) {
                        v0Var.setSelectedForDelete(true);
                        return;
                    }
                    ig.p0 filter = v0Var.getFilter();
                    w0Var.I(filter);
                    org.telegram.ui.ActionBar.s0 s0Var = w0Var.H;
                    if (s0Var != null) {
                        s0Var.j(filter);
                        w0Var.H.l(w0Var.e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 27:
                org.telegram.ui.ActionBar.u0 u0Var = (org.telegram.ui.ActionBar.u0) obj2;
                org.telegram.ui.ActionBar.w0 w0Var2 = (org.telegram.ui.ActionBar.w0) obj;
                if (w0Var2.x() && u0Var.f23110f) {
                    if (!w0Var2.T) {
                        w0Var2.T = true;
                        w0Var2.q();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.z zVar = w0Var2.f23176c;
                if (zVar != null) {
                    zVar.n(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.r0 r0Var = w0Var2.P;
                if (r0Var != null) {
                    r0Var.g(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 28:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f22515a) {
                    org.telegram.ui.ActionBar.b2 b2Var = e2Var.f22582o0;
                    if (b2Var != null) {
                        b2Var.h(e2Var, -1);
                    }
                    if (e2Var.f22575j0) {
                        e2Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.e2 e2Var2 = (org.telegram.ui.ActionBar.e2) obj2;
                if (!((org.telegram.ui.ActionBar.x1) obj).f22515a) {
                    org.telegram.ui.ActionBar.b2 b2Var2 = e2Var2.f22584q0;
                    if (b2Var2 != null) {
                        b2Var2.h(e2Var2, -2);
                    }
                    if (e2Var2.f22575j0) {
                        e2Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public q(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f5254a = 9;
        this.f5255b = context;
        this.f5256c = starsTransaction;
    }
}
