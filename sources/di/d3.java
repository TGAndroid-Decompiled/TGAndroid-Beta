package di;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.hy;
import org.telegram.ui.Components.i60;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.sr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.bx;
import org.telegram.ui.ix;
import org.telegram.ui.jx;
import org.telegram.ui.kl0;
import org.telegram.ui.rn;
public final class d3 implements View.OnClickListener {
    public final int f8641a;
    public final long f8642b;
    public final Object f8643c;
    public final Object d;

    public d3(Object obj, Object obj2, long j3, int i7) {
        this.f8641a = i7;
        this.f8643c = obj;
        this.d = obj2;
        this.f8642b = j3;
    }

    @Override
    public final void onClick(View view) {
        Activity W;
        int i7 = this.f8641a;
        long j3 = this.f8642b;
        Object obj = this.d;
        Object obj2 = this.f8643c;
        switch (i7) {
            case 0:
                f6 f6Var = (f6) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.f28948a = true;
                    bi.m8 m8Var = new bi.m8(f6Var.T1, str, this.f8642b, f6Var.J0);
                    m8Var.f3852e = new n1(f6Var, 1);
                    Q.showAsSheet(m8Var, obj3);
                    return;
                }
                return;
            case 1:
                final rn rnVar = (rn) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, rnVar.getParentActivity(), null);
                    t1Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !rnVar.N.d();
                    if (rnVar.N.getCheckBox().G == null) {
                        rnVar.N.setChecked(z10);
                    }
                    org.telegram.messenger.h3 I0 = rnVar.getMessagesController().I0();
                    final long j10 = this.f8642b;
                    I0.a(j10, new w10() {
                        @Override
                        public final void a(Object obj4) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                            rn rnVar2 = rn.this;
                            TLRPC.Chat chat = rnVar2.f51796x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                rnVar2.getMessagesController().X3(rnVar2.f51796x0, false);
                            }
                            Switch checkBox = rnVar2.N.getCheckBox();
                            if (tL_premium_boostsStatus.level < rnVar2.getMessagesController().D4) {
                                i10 = 2131232518;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                            if (z11 && tL_premium_boostsStatus.level < rnVar2.getMessagesController().D4) {
                                rnVar2.N.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.h3 I02 = rnVar2.getMessagesController().I0();
                                long j11 = j10;
                                I02.b(j11, tL_premium_boostsStatus, new bi.k2(rnVar2, t1Var2, tL_premium_boostsStatus, j11, 5));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            rnVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.mp.k1(rnVar2.f51796x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            rnVar2.N.setChecked(z11);
                            zArr2[0] = false;
                            t1Var2.dismiss();
                            rnVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new hi.k3(4, rnVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((sr) obj).run(-j3);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((sr) obj).run(-j3);
                return;
            case 4:
                i60 i60Var = (i60) obj2;
                Context context = (Context) obj;
                a0.h hVar = i60Var.f35937a2;
                if ((i60Var.f35943h2 != null || !hVar.i()) && (W = org.telegram.messenger.g0.W(context)) != null) {
                    if (i60Var.f35943h2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < hVar.m(); i10++) {
                            arrayList.add(Long.valueOf(hVar.j(i10)));
                        }
                        jx jxVar = (jx) i60Var.f35943h2.f54692b;
                        ArrayList arrayList2 = jxVar.f49222e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        jxVar.e0();
                        ix ixVar = jxVar.f49223f;
                        if (ixVar != null) {
                            ixVar.a();
                        }
                        i60Var.dismiss();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                    String G = gd.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28835a;
                    t1Var2.S = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < hVar.m(); i11++) {
                        TLRPC.User c22 = mp.u1(i60Var.f30223a).c2(Long.valueOf(hVar.j(i11)));
                        if (c22 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.i5.m(0, c22.first_name, c22.last_name));
                            sb2.append("**");
                        }
                    }
                    TLRPC.Chat O0 = mp.u1(i60Var.f30223a).O0(Long.valueOf(j3));
                    if (hVar.m() > 5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.W2(gd.G(hVar.m(), "AddManyMembersAlertNamesText", O0.title)));
                        String format = String.format("%d", Integer.valueOf(hVar.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        t1Var2.U = spannableStringBuilder;
                    } else {
                        t1Var2.U = org.telegram.messenger.g0.W2(gd.a0("AddMembersAlertNamesText", null, 2131754396, sb2, O0.title));
                    }
                    alertDialog$Builder.k(gd.N0(2131754483, null), new hy(i60Var, 5));
                    alertDialog$Builder.h(gd.N0(2131752577, null), null);
                    alertDialog$Builder.p();
                    return;
                }
                return;
            case 5:
                bx bxVar = (bx) obj2;
                boolean hasUnread = ((org.telegram.ui.Cells.u2) obj).getHasUnread();
                long j11 = this.f8642b;
                if (hasUnread) {
                    bxVar.A4(j11);
                } else {
                    bxVar.getMessagesController().r3(j11, null, 0L);
                }
                bxVar.finishPreviewFragment();
                return;
            default:
                kl0 kl0Var = (kl0) obj2;
                kl0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l10 = kl0Var.I0;
                if (l10 != null && longValue == l10.longValue()) {
                    kl0Var.f49478n0 = true;
                    kl0Var.f49467f[0].setText("");
                    kl0Var.f49478n0 = false;
                    kl0Var.I0 = 0L;
                    kl0Var.R0();
                } else {
                    kl0Var.f49467f[0].setText(gd.E0().q(this.f8642b, false, true, true, kl0Var.D0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = kl0Var.f49467f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
