package bi;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.c20;
import org.telegram.messenger.qp;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.u31;
import org.telegram.ui.Components.x50;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dx;
import org.telegram.ui.ex;
import org.telegram.ui.hl0;
import org.telegram.ui.pn;
import org.telegram.ui.ww;
public final class p3 implements View.OnClickListener {
    public final int f4505a;
    public final long f4506b;
    public final Object f4507c;
    public final Object d;

    public p3(Object obj, Object obj2, long j3, int i7) {
        this.f4505a = i7;
        this.f4507c = obj;
        this.d = obj2;
        this.f4506b = j3;
    }

    @Override
    public final void onClick(View view) {
        Activity W;
        int i7 = this.f4505a;
        long j3 = this.f4506b;
        Object obj = this.d;
        Object obj2 = this.f4507c;
        switch (i7) {
            case 0:
                k7 k7Var = (k7) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.f27424a = true;
                    zh.l3 l3Var = new zh.l3(k7Var.P1, str, this.f4506b, k7Var.I0);
                    l3Var.f60449e = new y3(k7Var, 0);
                    Q.showAsSheet(l3Var, obj3);
                    return;
                }
                return;
            case 1:
                final pn pnVar = (pn) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, pnVar.getParentActivity(), null);
                    u1Var.r(400L);
                    zArr[0] = true;
                    final boolean z9 = !pnVar.M.d();
                    if (pnVar.M.getCheckBox().F == null) {
                        pnVar.M.setChecked(z9);
                    }
                    org.telegram.messenger.f3 G0 = pnVar.getMessagesController().G0();
                    final long j10 = this.f4506b;
                    G0.a(j10, new c20() {
                        @Override
                        public final void a(Object obj4) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                            pn pnVar2 = pn.this;
                            TLRPC.Chat chat = pnVar2.f48889w0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                pnVar2.getMessagesController().Q3(pnVar2.f48889w0, false);
                            }
                            Switch checkBox = pnVar2.M.getCheckBox();
                            if (tL_premium_boostsStatus.level < pnVar2.getMessagesController().A4) {
                                i10 = 2131232513;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z10 = z9;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.u1 u1Var2 = u1Var;
                            if (z10 && tL_premium_boostsStatus.level < pnVar2.getMessagesController().A4) {
                                pnVar2.M.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.f3 G02 = pnVar2.getMessagesController().G0();
                                long j11 = j10;
                                G02.b(j11, tL_premium_boostsStatus, new bi.r2(pnVar2, u1Var2, tL_premium_boostsStatus, j11));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            pnVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.qp.i1(pnVar2.f48889w0);
                            tL_channels_toggleAutotranslation.enabled = z10;
                            pnVar2.M.setChecked(z10);
                            zArr2[0] = false;
                            u1Var2.dismiss();
                            pnVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new fi.d3(4, pnVar2, z10), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((fr) obj).run(-j3);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.u1[]) obj2)[0].dismiss();
                ((fr) obj).run(-j3);
                return;
            case 4:
                x50 x50Var = (x50) obj2;
                Context context = (Context) obj;
                a0.h hVar = x50Var.W1;
                if ((x50Var.d2 != null || !hVar.i()) && (W = org.telegram.messenger.g0.W(context)) != null) {
                    if (x50Var.d2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < hVar.m(); i10++) {
                            arrayList.add(Long.valueOf(hVar.j(i10)));
                        }
                        ex exVar = (ex) x50Var.d2.f51501b;
                        ArrayList arrayList2 = exVar.f45384e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        exVar.e0();
                        dx dxVar = exVar.f45385f;
                        if (dxVar != null) {
                            dxVar.a();
                        }
                        x50Var.dismiss();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                    String G = org.telegram.messenger.id.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.u1 u1Var2 = alertDialog$Builder.f27296a;
                    u1Var2.R = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < hVar.m(); i11++) {
                        TLRPC.User a22 = qp.s1(x50Var.f28616a).a2(Long.valueOf(hVar.j(i11)));
                        if (a22 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            sb2.append("**");
                        }
                    }
                    TLRPC.Chat M0 = qp.s1(x50Var.f28616a).M0(Long.valueOf(j3));
                    if (hVar.m() > 5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(org.telegram.messenger.id.G(hVar.m(), "AddManyMembersAlertNamesText", M0.title)));
                        String format = String.format("%d", Integer.valueOf(hVar.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new u31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        u1Var2.T = spannableStringBuilder;
                    } else {
                        u1Var2.T = org.telegram.messenger.g0.X2(org.telegram.messenger.id.a0("AddMembersAlertNamesText", null, 2131754399, sb2, M0.title));
                    }
                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131754486, null), new bx(x50Var, 6));
                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                    alertDialog$Builder.p();
                    return;
                }
                return;
            case 5:
                ww wwVar = (ww) obj2;
                boolean hasUnread = ((org.telegram.ui.Cells.t2) obj).getHasUnread();
                long j11 = this.f4506b;
                if (hasUnread) {
                    wwVar.v4(j11);
                } else {
                    wwVar.getMessagesController().k3(j11, null, 0L);
                }
                wwVar.finishPreviewFragment();
                return;
            default:
                hl0 hl0Var = (hl0) obj2;
                hl0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l10 = hl0Var.H0;
                if (l10 != null && longValue == l10.longValue()) {
                    hl0Var.m0 = true;
                    hl0Var.f46419f[0].setText("");
                    hl0Var.m0 = false;
                    hl0Var.H0 = 0L;
                    hl0Var.R0();
                } else {
                    hl0Var.f46419f[0].setText(org.telegram.messenger.id.E0().q(this.f4506b, false, true, true, hl0Var.C0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = hl0Var.f46419f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
