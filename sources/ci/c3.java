package ci;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.fr;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.t50;
import org.telegram.ui.Components.zw;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
import org.telegram.ui.cx;
import org.telegram.ui.dl0;
import org.telegram.ui.ln;
import org.telegram.ui.uw;
public final class c3 implements View.OnClickListener {
    public final int f4908a;
    public final long f4909b;
    public final Object f4910c;
    public final Object d;

    public c3(Object obj, Object obj2, long j10, int i3) {
        this.f4908a = i3;
        this.f4910c = obj;
        this.d = obj2;
        this.f4909b = j10;
    }

    @Override
    public final void onClick(View view) {
        Activity W;
        int i3 = this.f4908a;
        long j10 = this.f4909b;
        Object obj = this.d;
        Object obj2 = this.f4910c;
        switch (i3) {
            case 0:
                l6 l6Var = (l6) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.f27395a = true;
                    ai.i6 i6Var = new ai.i6(l6Var.Q1, str, this.f4909b, l6Var.J0);
                    i6Var.f719e = new k3(l6Var, 0);
                    Q.showAsSheet(i6Var, obj3);
                    return;
                }
                return;
            case 1:
                final ln lnVar = (ln) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, lnVar.getParentActivity(), null);
                    s1Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !lnVar.N.d();
                    if (lnVar.N.getCheckBox().G == null) {
                        lnVar.N.setChecked(z10);
                    }
                    org.telegram.messenger.f3 G0 = lnVar.getMessagesController().G0();
                    final long j11 = this.f4909b;
                    G0.a(j11, new u10() {
                        @Override
                        public final void a(Object obj4) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                            ln lnVar2 = ln.this;
                            TLRPC.Chat chat = lnVar2.f47396x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                lnVar2.getMessagesController().Q3(lnVar2.f47396x0, false);
                            }
                            Switch checkBox = lnVar2.N.getCheckBox();
                            if (tL_premium_boostsStatus.level < lnVar2.getMessagesController().A4) {
                                i10 = 2131232513;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.s1 s1Var2 = s1Var;
                            if (z11 && tL_premium_boostsStatus.level < lnVar2.getMessagesController().A4) {
                                lnVar2.N.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.f3 G02 = lnVar2.getMessagesController().G0();
                                long j12 = j11;
                                G02.b(j12, tL_premium_boostsStatus, new ai.m1(lnVar2, s1Var2, tL_premium_boostsStatus, j12, 5));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            lnVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.hp.i1(lnVar2.f47396x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            lnVar2.N.setChecked(z11);
                            zArr2[0] = false;
                            s1Var2.dismiss();
                            lnVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new gi.b3(4, lnVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.s1[]) obj2)[0].dismiss();
                ((fr) obj).run(-j10);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.s1[]) obj2)[0].dismiss();
                ((fr) obj).run(-j10);
                return;
            case 4:
                t50 t50Var = (t50) obj2;
                Context context = (Context) obj;
                a0.h hVar = t50Var.X1;
                if ((t50Var.f38291e2 != null || !hVar.i()) && (W = org.telegram.messenger.g0.W(context)) != null) {
                    if (t50Var.f38291e2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < hVar.m(); i10++) {
                            arrayList.add(Long.valueOf(hVar.j(i10)));
                        }
                        cx cxVar = (cx) t50Var.f38291e2.f50177b;
                        ArrayList arrayList2 = cxVar.f44458e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        cxVar.e0();
                        bx bxVar = cxVar.f44459f;
                        if (bxVar != null) {
                            bxVar.a();
                        }
                        t50Var.dismiss();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                    String G = bd.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.s1 s1Var2 = alertDialog$Builder.f27343a;
                    s1Var2.S = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < hVar.m(); i11++) {
                        TLRPC.User a22 = hp.s1(t50Var.f28583a).a2(Long.valueOf(hVar.j(i11)));
                        if (a22 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            sb2.append("**");
                        }
                    }
                    TLRPC.Chat M0 = hp.s1(t50Var.f28583a).M0(Long.valueOf(j10));
                    if (hVar.m() > 5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(bd.G(hVar.m(), "AddManyMembersAlertNamesText", M0.title)));
                        String format = String.format("%d", Integer.valueOf(hVar.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        s1Var2.U = spannableStringBuilder;
                    } else {
                        s1Var2.U = org.telegram.messenger.g0.X2(bd.a0("AddMembersAlertNamesText", null, 2131754399, sb2, M0.title));
                    }
                    alertDialog$Builder.k(bd.M0(2131754486, null), new zw(t50Var, 6));
                    alertDialog$Builder.h(bd.M0(2131752589, null), null);
                    alertDialog$Builder.p();
                    return;
                }
                return;
            case 5:
                uw uwVar = (uw) obj2;
                boolean hasUnread = ((org.telegram.ui.Cells.t2) obj).getHasUnread();
                long j12 = this.f4909b;
                if (hasUnread) {
                    uwVar.v4(j12);
                } else {
                    uwVar.getMessagesController().k3(j12, null, 0L);
                }
                uwVar.finishPreviewFragment();
                return;
            default:
                dl0 dl0Var = (dl0) obj2;
                dl0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l10 = dl0Var.I0;
                if (l10 != null && longValue == l10.longValue()) {
                    dl0Var.f44761n0 = true;
                    dl0Var.f44750f[0].setText("");
                    dl0Var.f44761n0 = false;
                    dl0Var.I0 = 0L;
                    dl0Var.R0();
                } else {
                    dl0Var.f44750f[0].setText(bd.E0().q(this.f4909b, false, true, true, dl0Var.D0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = dl0Var.f44750f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
