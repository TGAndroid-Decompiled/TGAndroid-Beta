package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;
public final class fg implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public fg(Object obj, Object obj2, long j, byte b) {
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = j;
    }

    @Override
    public final void onClick(View view) {
        Activity W;
        byte b = this.a;
        long j = this.c;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((hd[]) obj2)[0].dismiss();
                ((od3) obj).run(-j);
                return;
            case 1:
                ((hd[]) obj2)[0].dismiss();
                ((od3) obj).run(-j);
                return;
            case 2:
                final p82 p82Var = (p82) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final hd hdVar = new hd(3, null, p82Var.getParentActivity());
                    hdVar.q(400L);
                    zArr[0] = true;
                    final boolean z = !p82Var.N.d();
                    if (p82Var.N.getCheckBox().G == null) {
                        p82Var.N.setChecked(z);
                    }
                    og1 E0 = p82Var.getMessagesController().E0();
                    final long j2 = this.c;
                    E0.a(j2, new p8c() {
                        @Override
                        public final void a(Object obj3) {
                            int i;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj3;
                            p82 p82Var2 = p82.this;
                            TLRPC.Chat chat = p82Var2.x0;
                            int i2 = chat.level;
                            int i3 = tL_premium_boostsStatus.level;
                            if (i2 != i3) {
                                chat.level = i3;
                                p82Var2.getMessagesController().T3(p82Var2.x0, false);
                            }
                            Switch checkBox = p82Var2.N.getCheckBox();
                            if (tL_premium_boostsStatus.level < p82Var2.getMessagesController().k4.U1.f()) {
                                i = 2131232518;
                            } else {
                                i = 0;
                            }
                            checkBox.setIcon(i);
                            boolean z2 = z;
                            boolean[] zArr2 = zArr;
                            hd hdVar2 = hdVar;
                            if (z2 && tL_premium_boostsStatus.level < p82Var2.getMessagesController().k4.U1.f()) {
                                p82Var2.N.setChecked(false);
                                zArr2[0] = false;
                                og1 E02 = p82Var2.getMessagesController().E0();
                                long j3 = j2;
                                E02.b(j3, tL_premium_boostsStatus, new s0c(p82Var2, hdVar2, tL_premium_boostsStatus, j3, (byte) 1));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            p82Var2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = na7.g1(p82Var2.x0);
                            tL_channels_toggleAutotranslation.enabled = z2;
                            p82Var2.N.setChecked(z2);
                            zArr2[0] = false;
                            hdVar2.dismiss();
                            p82Var2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new i81((byte) 2, p82Var2, z2), 64);
                        }
                    });
                    return;
                }
                return;
            case 3:
                cj3 cj3Var = (cj3) obj2;
                boolean hasUnread = ((ue3) obj).getHasUnread();
                long j3 = this.c;
                if (hasUnread) {
                    cj3Var.u4(j3);
                } else {
                    cj3Var.getMessagesController().m3(j3, null, 0L);
                }
                cj3Var.finishPreviewFragment();
                return;
            case 4:
                jr5 jr5Var = (jr5) obj2;
                Context context = (Context) obj;
                vf6 vf6Var = jr5Var.Z1;
                if ((jr5Var.g2 != null || !vf6Var.i()) && (W = gl.W(context)) != null) {
                    if (jr5Var.g2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < vf6Var.m(); i++) {
                            arrayList.add(Long.valueOf(vf6Var.j(i)));
                        }
                        zt3 zt3Var = (zt3) jr5Var.g2.b;
                        ArrayList arrayList2 = zt3Var.e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        zt3Var.d0();
                        yt3 yt3Var = zt3Var.f;
                        if (yt3Var != null) {
                            yt3Var.a();
                        }
                        jr5Var.dismiss();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                    String G = k96.G(vf6Var.m(), "AddManyMembersAlertTitle", new Object[0]);
                    hd hdVar2 = alertDialog$Builder.a;
                    hdVar2.S = G;
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < vf6Var.m(); i2++) {
                        TLRPC.User V1 = na7.q1(jr5Var.a).V1(Long.valueOf(vf6Var.j(i2)));
                        if (V1 != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append("**");
                            sb.append(qu2.m(0, V1.first_name, V1.last_name));
                            sb.append("**");
                        }
                    }
                    TLRPC.Chat K0 = na7.q1(jr5Var.a).K0(Long.valueOf(j));
                    if (vf6Var.m() > 5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gl.S2(k96.G(vf6Var.m(), "AddManyMembersAlertNamesText", K0.title)));
                        String format = String.format("%d", Integer.valueOf(vf6Var.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new z3c(gl.o()), indexOf, format.length() + indexOf, 33);
                        }
                        hdVar2.U = spannableStringBuilder;
                    } else {
                        hdVar2.U = gl.S2(k96.a0("AddMembersAlertNamesText", null, 2131754396, sb, K0.title));
                    }
                    alertDialog$Builder.j(k96.M0(2131754483, null), new ry4(jr5Var, (byte) 12));
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    alertDialog$Builder.o();
                    return;
                }
                return;
            case 5:
                p pVar = (p) obj2;
                long longValue = ((Long) ((TextView) obj).getTag()).longValue();
                Long l = pVar.I0;
                if (l != null && longValue == l.longValue()) {
                    pVar.n0 = true;
                    pVar.f[0].setText("");
                    pVar.n0 = false;
                    pVar.I0 = 0L;
                    pVar.Q0();
                } else {
                    pVar.f[0].setText(k96.D0().q(this.c, false, true, true, pVar.D0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = pVar.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                vqa vqaVar = (vqa) obj2;
                String str = (String) obj;
                d Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.a = true;
                    z99 z99Var = new z99(vqaVar.S1, str, this.c, vqaVar.J0);
                    z99Var.e = new qna(vqaVar, (byte) 1);
                    Q.showAsSheet(z99Var, obj3);
                    return;
                }
                return;
        }
    }
}
