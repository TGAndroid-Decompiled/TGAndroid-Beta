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
public final class fh implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public fh(Object obj, Object obj2, long j, byte b) {
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
                ((he[]) obj2)[0].dismiss();
                ((af3) obj).run(-j);
                return;
            case 1:
                ((he[]) obj2)[0].dismiss();
                ((af3) obj).run(-j);
                return;
            case 2:
                final ba2 ba2Var = (ba2) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final he heVar = new he(3, null, ba2Var.getParentActivity());
                    heVar.q(400L);
                    zArr[0] = true;
                    final boolean z = !ba2Var.N.d();
                    if (ba2Var.N.getCheckBox().G == null) {
                        ba2Var.N.setChecked(z);
                    }
                    wh1 F0 = ba2Var.getMessagesController().F0();
                    final long j2 = this.c;
                    F0.a(j2, new qac() {
                        @Override
                        public final void a(Object obj3) {
                            int i;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj3;
                            ba2 ba2Var2 = ba2.this;
                            TLRPC.Chat chat = ba2Var2.x0;
                            int i2 = chat.level;
                            int i3 = tL_premium_boostsStatus.level;
                            if (i2 != i3) {
                                chat.level = i3;
                                ba2Var2.getMessagesController().V3(ba2Var2.x0, false);
                            }
                            Switch checkBox = ba2Var2.N.getCheckBox();
                            if (tL_premium_boostsStatus.level < ba2Var2.getMessagesController().l4.U1.f()) {
                                i = 2131232530;
                            } else {
                                i = 0;
                            }
                            checkBox.setIcon(i);
                            boolean z2 = z;
                            boolean[] zArr2 = zArr;
                            he heVar2 = heVar;
                            if (z2 && tL_premium_boostsStatus.level < ba2Var2.getMessagesController().l4.U1.f()) {
                                ba2Var2.N.setChecked(false);
                                zArr2[0] = false;
                                wh1 F02 = ba2Var2.getMessagesController().F0();
                                long j3 = j2;
                                F02.b(j3, tL_premium_boostsStatus, new s2c(ba2Var2, heVar2, tL_premium_boostsStatus, j3, (byte) 1));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            ba2Var2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = oc7.h1(ba2Var2.x0);
                            tL_channels_toggleAutotranslation.enabled = z2;
                            ba2Var2.N.setChecked(z2);
                            zArr2[0] = false;
                            heVar2.dismiss();
                            ba2Var2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new r91((byte) 2, ba2Var2, z2), 64);
                        }
                    });
                    return;
                }
                return;
            case 3:
                nk3 nk3Var = (nk3) obj2;
                boolean hasUnread = ((hg3) obj).getHasUnread();
                long j3 = this.c;
                if (hasUnread) {
                    nk3Var.y4(j3);
                } else {
                    nk3Var.getMessagesController().o3(j3, null, 0L);
                }
                nk3Var.finishPreviewFragment();
                return;
            case 4:
                it5 it5Var = (it5) obj2;
                Context context = (Context) obj;
                vh6 vh6Var = it5Var.Z1;
                if ((it5Var.g2 != null || !vh6Var.i()) && (W = gm.W(context)) != null) {
                    if (it5Var.g2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < vh6Var.m(); i++) {
                            arrayList.add(Long.valueOf(vh6Var.j(i)));
                        }
                        kv3 kv3Var = (kv3) it5Var.g2.b;
                        ArrayList arrayList2 = kv3Var.e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        kv3Var.e0();
                        jv3 jv3Var = kv3Var.f;
                        if (jv3Var != null) {
                            jv3Var.a();
                        }
                        it5Var.dismiss();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                    String G = jb6.G(vh6Var.m(), "AddManyMembersAlertTitle", new Object[0]);
                    he heVar2 = alertDialog$Builder.a;
                    heVar2.S = G;
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < vh6Var.m(); i2++) {
                        TLRPC.User W1 = oc7.r1(it5Var.a).W1(Long.valueOf(vh6Var.j(i2)));
                        if (W1 != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append("**");
                            sb.append(bw2.m(0, W1.first_name, W1.last_name));
                            sb.append("**");
                        }
                    }
                    TLRPC.Chat L0 = oc7.r1(it5Var.a).L0(Long.valueOf(j));
                    if (vh6Var.m() > 5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(gm.S2(jb6.G(vh6Var.m(), "AddManyMembersAlertNamesText", L0.title)));
                        String format = String.format("%d", Integer.valueOf(vh6Var.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new z5c(gm.o()), indexOf, format.length() + indexOf, 33);
                        }
                        heVar2.U = spannableStringBuilder;
                    } else {
                        heVar2.U = gm.S2(jb6.a0("AddMembersAlertNamesText", null, 2131754396, sb, L0.title));
                    }
                    alertDialog$Builder.j(jb6.M0(2131754483, null), new wx4(it5Var, (byte) 15));
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
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
                    pVar.R0();
                } else {
                    pVar.f[0].setText(jb6.D0().q(this.c, false, true, true, pVar.D0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = pVar.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                wsa wsaVar = (wsa) obj2;
                String str = (String) obj;
                d Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.a = true;
                    zb9 zb9Var = new zb9(wsaVar.S1, str, this.c, wsaVar.J0);
                    zb9Var.e = new qpa(wsaVar, (byte) 1);
                    Q.showAsSheet(zb9Var, obj3);
                    return;
                }
                return;
        }
    }
}
