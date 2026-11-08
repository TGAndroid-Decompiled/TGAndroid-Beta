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
import org.telegram.messenger.p10;
import org.telegram.messenger.qp;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.we;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.ru;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.an;
public final class r implements View.OnClickListener {
    public final int f4598a;
    public final Object f4599b;
    public final Object f4600c;

    public r(int i7, Object obj, Object obj2) {
        this.f4598a = i7;
        this.f4600c = obj;
        this.f4599b = obj2;
    }

    @Override
    public final void onClick(View view) {
        Integer num;
        di.b4 b4Var;
        int i7 = this.f4598a;
        r1 r1Var = null;
        CharSequence charSequence = null;
        r1Var = null;
        Object obj = this.f4599b;
        Object obj2 = this.f4600c;
        switch (i7) {
            case 0:
                z.c0((z) obj2, (Context) obj, view);
                return;
            case 1:
                a1 a1Var = (a1) obj2;
                Context context = (Context) obj;
                String[] strArr = new String[6];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int[] iArr = a1.f3420p2;
                    if (i10 < 6) {
                        strArr[i10] = org.telegram.messenger.id.G(iArr[i10] / 3600, "GiftOfferHours", new Object[0]);
                        if (iArr[i10] == a1Var.f3426g2) {
                            i11 = i10;
                        }
                        i10++;
                    } else {
                        String M0 = org.telegram.messenger.id.M0(2131749731, null);
                        ai.i iVar = new ai.i(a1Var, 4);
                        Pattern pattern = org.telegram.ui.Components.v4.f38848a;
                        kg.x1 b10 = kg.x1.b(p10.f24470s0);
                        b10.g();
                        if (!b10.d.isEmpty()) {
                            int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27960j5, false);
                            int x03 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27925h5, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.xj, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Bj, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.E8, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.G8, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27944i6, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Gi, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ci, false);
                            org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.Ei, false);
                            org.telegram.ui.ActionBar.v2 l10 = org.telegram.messenger.k5.l(1, context, null, false);
                            l10.f28651v0 = false;
                            LinearLayout linearLayout = new LinearLayout(context);
                            linearLayout.setOrientation(0);
                            linearLayout.setWeightSum(1.0f);
                            hb0 hb0Var = new hb0(context, null);
                            hb0Var.setAllItemsCount(6);
                            hb0Var.setItemCount(Math.min(6, 8));
                            hb0Var.setTextColor(x02);
                            hb0Var.setGravity(17);
                            hb0Var.setMinValue(0);
                            hb0Var.setMaxValue(5);
                            hb0Var.setValue(i11);
                            linearLayout.addView(hb0Var, c8.ha.l(1.0f, 0, 432));
                            hb0Var.setFormatter(new org.telegram.ui.Components.u(strArr, 7));
                            org.telegram.ui.Components.f4 f4Var = new org.telegram.ui.Components.f4(context, hb0Var, 2);
                            f4Var.setOrientation(1);
                            FrameLayout frameLayout = new FrameLayout(context);
                            TextView textView = new TextView(context);
                            textView.setText(M0);
                            textView.setTextColor(x02);
                            textView.setTextSize(1, 20.0f);
                            textView.setTypeface(org.telegram.messenger.g0.o());
                            frameLayout.addView(textView, c8.ha.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
                            textView.setOnTouchListener(new ei.b(10));
                            f4Var.addView(frameLayout, c8.ha.t(-1, -2, 51, 22, 0, 0, 4));
                            f4Var.addView(linearLayout, c8.ha.q(-1, -2, 1.0f, 0, 0, 12, 0, 12));
                            fi.d dVar = new fi.d(context, null, true);
                            dVar.i(org.telegram.messenger.id.M0(2131745675, null), false, true);
                            dVar.setOnClickListener(new org.telegram.ui.Components.i2(r3, 1));
                            f4Var.addView(dVar, c8.ha.t(-1, 48, 0, 16, 12, 16, 12));
                            l10.N = f4Var;
                            l10.show();
                            l10.setOnDismissListener(new u3(9, iVar, hb0Var));
                            l10.v0(x03);
                            l10.O(x03);
                            org.telegram.ui.ActionBar.v2[] v2VarArr = {l10};
                            return;
                        }
                        return;
                    }
                }
            case 2:
                h1 h1Var = (h1) obj2;
                ai.f1 f1Var = (ai.f1) obj;
                fi.d dVar2 = h1Var.f3976m1;
                if (dVar2.f11752c0 && !dVar2.Q) {
                    org.telegram.messenger.g0.v1(h1Var.f3974j1);
                    dVar2.setLoading(true);
                    f1Var.a(h1Var.f3984v1);
                    return;
                }
                return;
            case 3:
                w1 w1Var = (w1) obj2;
                ArrayList<TL_stars.StarGiftAttribute> arrayList = (ArrayList) obj;
                o1 o1Var = w1Var.f4940g2;
                int i12 = w1Var.f4951r2;
                if (i12 == 2) {
                    o1Var.setPreviewingAttributes(arrayList);
                    w1Var.g1(1);
                    return;
                } else if (i12 == 1) {
                    r1 r1Var2 = new r1(o1Var.getUpgradeBackdropAttribute(), o1Var.getUpgradePatternAttribute(), o1Var.getUpgradeImageViewAttribute());
                    w1Var.f4945l2 = r1Var2;
                    o1Var.setPreviewAttributes(r1Var2);
                    w1Var.g1(2);
                    return;
                } else {
                    return;
                }
            case 4:
                r1 r1Var3 = (r1) obj;
                w1 w1Var2 = ((p1) obj2).P;
                int i13 = w1Var2.f4951r2;
                o1 o1Var2 = w1Var2.f4940g2;
                if (i13 == 1) {
                    w1Var2.f4945l2 = new r1(o1Var2.getUpgradeBackdropAttribute(), o1Var2.getUpgradePatternAttribute(), o1Var2.getUpgradeImageViewAttribute());
                    w1Var2.g1(2);
                }
                int i14 = w1Var2.f4936b2.f4864s;
                r1 r1Var4 = w1Var2.f4945l2;
                if (r1Var4 != null) {
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = r1Var4.f4604a;
                    TL_stars.starGiftAttributeModel stargiftattributemodel = r1Var4.f4606c;
                    TL_stars.starGiftAttributePattern stargiftattributepattern = r1Var4.f4605b;
                    if (i14 == 1) {
                        r1Var = new r1(r1Var3.f4604a, stargiftattributepattern, stargiftattributemodel);
                    } else if (i14 == 2) {
                        r1Var = new r1(stargiftattributebackdrop, r1Var3.f4605b, stargiftattributemodel);
                    } else if (i14 == 0) {
                        r1Var = new r1(stargiftattributebackdrop, stargiftattributepattern, r1Var3.f4606c);
                    }
                }
                w1Var2.f4945l2 = r1Var;
                o1Var2.setPreviewAttributes(r1Var);
                w1Var2.i1();
                return;
            case 5:
                k7 k7Var = (k7) obj2;
                boolean z9 = !k7Var.f4193p3;
                k7Var.f4193p3 = z9;
                ((org.telegram.ui.Cells.c2) obj).c(z9, true);
                return;
            case 6:
                vf.c.v(((k7) obj2).getContext(), ((TL_stars.UniqueStarGiftValueInfo) obj).fragment_listed_url, false);
                return;
            case 7:
                ((k7) obj2).o2((CharSequence) obj);
                return;
            case 8:
                d6 d6Var = (d6) obj2;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (d6Var.E.getAlpha() >= 1.0f && !d6Var.f3666h0 && !d6Var.f3668j0 && d6Var.f3660d0 != null) {
                    new w1(d6Var.getContext(), f6Var, d6Var.W, d6Var.f3659c0, d6Var.f3660d0, true).show();
                    return;
                }
                return;
            case 9:
                vf.c.t((Context) obj, ((TL_stars.StarsTransaction) obj2).transaction_url);
                return;
            case 10:
                di.i4 i4Var = (di.i4) obj2;
                di.c8 c8Var = (di.c8) obj;
                di.p9 p9Var = i4Var.f9192s0;
                if (c8Var.f8880b != null) {
                    Bundle bundle = new Bundle();
                    if (c8Var.f8880b.longValue() >= 0) {
                        bundle.putLong("user_id", c8Var.f8880b.longValue());
                    } else {
                        bundle.putLong("chat_id", -c8Var.f8880b.longValue());
                    }
                    if (c8Var.f8882e && (num = c8Var.d) != null) {
                        bundle.putInt("message_id", num.intValue());
                        p9Var.N(new an(bundle));
                        return;
                    }
                    p9Var.N(new ProfileActivity(bundle, null));
                    return;
                }
                org.telegram.ui.Components.cc Q = new org.telegram.ui.Components.hc(i4Var.L0, i4Var.f9163k0).Q(2131624011, 36, org.telegram.messenger.id.M0(2131744667, null));
                Q.f32538a = 3;
                Q.k(true);
                return;
            case 11:
                di.i4 i4Var2 = (di.i4) obj2;
                ((di.g9) i4Var2.f9221z1).h(new ug.w0(i4Var2.f9192s0.f9543f, 14, false));
                ((org.telegram.ui.ActionBar.v2) obj).dismiss();
                return;
            case 12:
                di.i4 i4Var3 = ((di.z3) obj2).f10013x;
                ru alert = ((di.k8) obj).getAlert();
                if (alert != null && (b4Var = i4Var3.f9221z1) != null) {
                    ((di.g9) b4Var).h(alert);
                    i4Var3.f9136c1.a();
                    return;
                }
                return;
            case 13:
                fi.f3 f3Var = (fi.f3) obj2;
                f3Var.e((we) obj, false);
                f3Var.F.o();
                return;
            case 14:
                fi.m7 m7Var = (fi.m7) obj2;
                f2.h hVar = (f2.h) obj;
                org.telegram.ui.Cells.k3 k3Var = m7Var.Q1;
                try {
                    charSequence = ((ClipboardManager) m7Var.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(m7Var.getContext());
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (charSequence != null) {
                    k3Var.d.setText(charSequence.toString());
                    org.telegram.ui.Cells.i3 i3Var = k3Var.d;
                    i3Var.setSelection(0, i3Var.getText().length());
                }
                hVar.run();
                return;
            case 15:
                fi.va vaVar = (fi.va) obj2;
                new fi.w7((Context) obj, vaVar.f12942c, true, vaVar.f13009x0, new fi.v8(vaVar, 20), vaVar.f12934a).show();
                return;
            case 16:
                hi.j.A0((hi.j) obj2, (Context) obj);
                return;
            case 17:
                hi.a3 a3Var = (hi.a3) obj2;
                hi.f0 f0Var = (hi.f0) obj;
                if (f0Var.c()) {
                    f0Var.a();
                } else {
                    File file = f0Var.d;
                    if (file != null && file.exists()) {
                        File file2 = f0Var.d;
                        org.telegram.messenger.g0.t2(file2, file2.getName(), null, LaunchActivity.G1, null, true);
                    }
                }
                k60 k60Var = a3Var.O0;
                if (k60Var != null) {
                    k60Var.u();
                    a3Var.O0 = null;
                    return;
                }
                return;
            case 18:
                TL_payments.connectedBotStarRef connectedbotstarref = (TL_payments.connectedBotStarRef) obj;
                ((org.telegram.ui.ActionBar.v2) obj2).dismiss();
                org.telegram.ui.ActionBar.f2 T = LaunchActivity.T();
                if (T != null) {
                    T.presentFragment(ProfileActivity.A4(connectedbotstarref.bot_id));
                    return;
                }
                return;
            case 19:
                org.telegram.messenger.g0.g(((TL_account.TL_businessChatLink) obj2).link);
                org.telegram.ui.Components.hc.a0((an) obj).k(false).j();
                return;
            case 20:
                kg.i0 i0Var = (kg.i0) obj2;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj;
                kg.a0 a0Var = i0Var.R1;
                fi.d dVar3 = i0Var.V1;
                if (!dVar3.Q) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.bot = qp.s1(i0Var.f28616a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = a0Var.b();
                    ConnectionsManager.getInstance(i0Var.f28616a).sendRequest(updateconnectedbot, new f2(i0Var, tL_connectedBot, a0Var.c(), 10));
                    return;
                }
                return;
            case 21:
                ki.b bVar = (ki.b) obj2;
                bVar.getClass();
                ((Runnable) obj).run();
                bVar.dismiss();
                return;
            case 22:
                li.b2.c0((li.b2) obj2, (Context) obj, view);
                return;
            case 23:
                ((VideoAds) obj2).lambda$show$2((VideoAds.CloseDrawable) obj, view);
                return;
            case 24:
                ((VideoAds) obj2).lambda$show$18((TLRPC.TL_sponsoredMessage) obj, view);
                return;
            case 25:
                org.telegram.ui.ActionBar.r0 r0Var = (org.telegram.ui.ActionBar.r0) obj2;
                org.telegram.ui.ActionBar.q0 q0Var = (org.telegram.ui.ActionBar.q0) obj;
                int indexOf = r0Var.f28433g0.indexOf(q0Var.getFilter());
                if (r0Var.f28434h0 != indexOf) {
                    r0Var.f28434h0 = indexOf;
                    r0Var.D();
                    return;
                } else if (q0Var.getFilter().h) {
                    if (!q0Var.f28387a.f55487f) {
                        q0Var.setSelectedForDelete(true);
                        return;
                    }
                    jg.o0 filter = q0Var.getFilter();
                    r0Var.I(filter);
                    org.telegram.ui.ActionBar.n0 n0Var = r0Var.H;
                    if (n0Var != null) {
                        n0Var.j(filter);
                        r0Var.H.l(r0Var.f28429e);
                        return;
                    }
                    return;
                } else {
                    return;
                }
            case 26:
                org.telegram.ui.ActionBar.p0 p0Var = (org.telegram.ui.ActionBar.p0) obj2;
                org.telegram.ui.ActionBar.r0 r0Var2 = (org.telegram.ui.ActionBar.r0) obj;
                if (r0Var2.x() && p0Var.f28357f) {
                    if (!r0Var2.T) {
                        r0Var2.T = true;
                        r0Var2.q();
                    } else {
                        return;
                    }
                }
                org.telegram.ui.ActionBar.y yVar = r0Var2.f28426c;
                if (yVar != null) {
                    yVar.o(((Integer) view.getTag()).intValue());
                    return;
                }
                org.telegram.ui.ActionBar.m0 m0Var = r0Var2.P;
                if (m0Var != null) {
                    m0Var.i(((Integer) view.getTag()).intValue());
                    return;
                }
                return;
            case 27:
                org.telegram.ui.ActionBar.u1 u1Var = (org.telegram.ui.ActionBar.u1) obj2;
                if (!((org.telegram.ui.ActionBar.n1) obj).f28281a) {
                    org.telegram.ui.ActionBar.r1 r1Var5 = u1Var.m0;
                    if (r1Var5 != null) {
                        r1Var5.g(u1Var, -1);
                    }
                    if (u1Var.f28574j0) {
                        u1Var.dismiss();
                        return;
                    }
                    return;
                }
                return;
            case 28:
                org.telegram.ui.ActionBar.u1 u1Var2 = (org.telegram.ui.ActionBar.u1) obj2;
                if (!((org.telegram.ui.ActionBar.n1) obj).f28281a) {
                    org.telegram.ui.ActionBar.r1 r1Var6 = u1Var2.f28579o0;
                    if (r1Var6 != null) {
                        r1Var6.g(u1Var2, -2);
                    }
                    if (u1Var2.f28574j0) {
                        u1Var2.cancel();
                        return;
                    }
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.u1 u1Var3 = (org.telegram.ui.ActionBar.u1) obj2;
                if (!((org.telegram.ui.ActionBar.n1) obj).f28281a) {
                    org.telegram.ui.ActionBar.r1 r1Var7 = u1Var3.f28585s0;
                    if (r1Var7 != null) {
                        r1Var7.g(u1Var3, -2);
                    }
                    if (u1Var3.f28574j0) {
                        u1Var3.dismiss();
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public r(Context context, TL_stars.StarsTransaction starsTransaction) {
        this.f4598a = 9;
        this.f4599b = context;
        this.f4600c = starsTransaction;
    }
}
