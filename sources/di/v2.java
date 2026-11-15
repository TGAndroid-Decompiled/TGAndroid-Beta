package di;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.Components.a60;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.y31;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fx;
import org.telegram.ui.gx;
import org.telegram.ui.kl0;
import org.telegram.ui.qn;
import org.telegram.ui.yw;
public final class v2 implements View.OnClickListener {
    public final int f9587a;
    public final long f9588b;
    public final Object f9589c;
    public final Object d;

    public v2(Object obj, Object obj2, long j3, int i7) {
        this.f9587a = i7;
        this.f9589c = obj;
        this.d = obj2;
        this.f9588b = j3;
    }

    @Override
    public final void onClick(View view) {
        Activity W;
        int i7 = this.f9587a;
        long j3 = this.f9588b;
        Object obj = this.d;
        Object obj2 = this.f9589c;
        switch (i7) {
            case 0:
                c6 c6Var = (c6) obj2;
                String str = (String) obj;
                org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.f28476a = true;
                    bi.a6 a6Var = new bi.a6(c6Var.T1, str, this.f9588b, c6Var.J0);
                    a6Var.f3381e = new n1(c6Var, 1);
                    Q.showAsSheet(a6Var, obj3);
                    return;
                }
                return;
            case 1:
                final qn qnVar = (qn) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, qnVar.getParentActivity(), null);
                    t1Var.r(400L);
                    zArr[0] = true;
                    final boolean z10 = !qnVar.N.d();
                    if (qnVar.N.getCheckBox().G == null) {
                        qnVar.N.setChecked(z10);
                    }
                    org.telegram.messenger.f3 G0 = qnVar.getMessagesController().G0();
                    final long j10 = this.f9588b;
                    G0.a(j10, new z10() {
                        @Override
                        public final void a(Object obj4) {
                            int i10;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj4;
                            qn qnVar2 = qn.this;
                            TLRPC.Chat chat = qnVar2.f50692x0;
                            int i11 = chat.level;
                            int i12 = tL_premium_boostsStatus.level;
                            if (i11 != i12) {
                                chat.level = i12;
                                qnVar2.getMessagesController().Q3(qnVar2.f50692x0, false);
                            }
                            Switch checkBox = qnVar2.N.getCheckBox();
                            if (tL_premium_boostsStatus.level < qnVar2.getMessagesController().B4) {
                                i10 = 2131232514;
                            } else {
                                i10 = 0;
                            }
                            checkBox.setIcon(i10);
                            boolean z11 = z10;
                            boolean[] zArr2 = zArr;
                            org.telegram.ui.ActionBar.t1 t1Var2 = t1Var;
                            if (z11 && tL_premium_boostsStatus.level < qnVar2.getMessagesController().B4) {
                                qnVar2.N.setChecked(false);
                                zArr2[0] = false;
                                org.telegram.messenger.f3 G02 = qnVar2.getMessagesController().G0();
                                long j11 = j10;
                                G02.b(j11, tL_premium_boostsStatus, new bi.i1(qnVar2, t1Var2, tL_premium_boostsStatus, j11, 5));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            qnVar2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = org.telegram.messenger.np.i1(qnVar2.f50692x0);
                            tL_channels_toggleAutotranslation.enabled = z11;
                            qnVar2.N.setChecked(z11);
                            zArr2[0] = false;
                            t1Var2.dismiss();
                            qnVar2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new hi.b3(4, qnVar2, z11), 64);
                        }
                    });
                    return;
                }
                return;
            case 2:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((mr) obj).run(-j3);
                return;
            case 3:
                ((org.telegram.ui.ActionBar.t1[]) obj2)[0].dismiss();
                ((mr) obj).run(-j3);
                return;
            case 4:
                a60 a60Var = (a60) obj2;
                Context context = (Context) obj;
                a0.h hVar = a60Var.f32867a2;
                if ((a60Var.f32873h2 != null || !hVar.i()) && (W = org.telegram.messenger.g0.W(context)) != null) {
                    if (a60Var.f32873h2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i10 = 0; i10 < hVar.m(); i10++) {
                            arrayList.add(Long.valueOf(hVar.j(i10)));
                        }
                        gx gxVar = (gx) a60Var.f32873h2.f54015b;
                        ArrayList arrayList2 = gxVar.f47529e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        gxVar.e0();
                        fx fxVar = gxVar.f47530f;
                        if (fxVar != null) {
                            fxVar.a();
                        }
                        a60Var.dismiss();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                    String G = hd.G(hVar.m(), "AddManyMembersAlertTitle", new Object[0]);
                    org.telegram.ui.ActionBar.t1 t1Var2 = alertDialog$Builder.f28392a;
                    t1Var2.S = G;
                    StringBuilder sb2 = new StringBuilder();
                    for (int i11 = 0; i11 < hVar.m(); i11++) {
                        TLRPC.User a22 = np.s1(a60Var.f29679a).a2(Long.valueOf(hVar.j(i11)));
                        if (a22 != null) {
                            if (sb2.length() > 0) {
                                sb2.append(", ");
                            }
                            sb2.append("**");
                            sb2.append(org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                            sb2.append("**");
                        }
                    }
                    TLRPC.Chat M0 = np.s1(a60Var.f29679a).M0(Long.valueOf(j3));
                    if (hVar.m() > 5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.X2(hd.G(hVar.m(), "AddManyMembersAlertNamesText", M0.title)));
                        String format = String.format("%d", Integer.valueOf(hVar.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), indexOf, format.length() + indexOf, 33);
                        }
                        t1Var2.U = spannableStringBuilder;
                    } else {
                        t1Var2.U = org.telegram.messenger.g0.X2(hd.a0("AddMembersAlertNamesText", null, 2131754399, sb2, M0.title));
                    }
                    alertDialog$Builder.k(hd.M0(2131754486, null), new org.telegram.ui.Components.gx(a60Var, 6));
                    alertDialog$Builder.h(hd.M0(2131752589, null), null);
                    alertDialog$Builder.p();
                    return;
                }
                return;
            case 5:
                yw ywVar = (yw) obj2;
                boolean hasUnread = ((org.telegram.ui.Cells.t2) obj).getHasUnread();
                long j11 = this.f9588b;
                if (hasUnread) {
                    ywVar.v4(j11);
                } else {
                    ywVar.getMessagesController().k3(j11, null, 0L);
                }
                ywVar.finishPreviewFragment();
                return;
            default:
                kl0 kl0Var = (kl0) obj2;
                kl0Var.getClass();
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l10 = kl0Var.I0;
                if (l10 != null && longValue == l10.longValue()) {
                    kl0Var.f48699n0 = true;
                    kl0Var.f48688f[0].setText("");
                    kl0Var.f48699n0 = false;
                    kl0Var.I0 = 0L;
                    kl0Var.R0();
                } else {
                    kl0Var.f48688f[0].setText(hd.E0().q(this.f9588b, false, true, true, kl0Var.D0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = kl0Var.f48688f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
        }
    }
}
