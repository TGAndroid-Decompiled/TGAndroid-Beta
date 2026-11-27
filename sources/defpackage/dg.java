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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.Switch;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.p;
public final class dg implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final long c;
    public final Object d;

    public dg(Object obj, Object obj2, long j, byte b) {
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
                ((id[]) obj2)[0].dismiss();
                ((he3) obj).run(-j);
                return;
            case 1:
                ((id[]) obj2)[0].dismiss();
                ((he3) obj).run(-j);
                return;
            case 2:
                final g92 g92Var = (g92) obj2;
                final boolean[] zArr = (boolean[]) obj;
                if (!zArr[0]) {
                    final id idVar = new id(3, null, g92Var.getParentActivity());
                    idVar.q(400L);
                    zArr[0] = true;
                    final boolean z = !g92Var.N.d();
                    if (g92Var.N.getCheckBox().G == null) {
                        g92Var.N.setChecked(z);
                    }
                    xg1 G0 = g92Var.getMessagesController().G0();
                    final long j2 = this.c;
                    G0.a(j2, new pcc() {
                        @Override
                        public final void a(Object obj3) {
                            int i;
                            TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj3;
                            g92 g92Var2 = g92.this;
                            TLRPC.Chat chat = g92Var2.x0;
                            int i2 = chat.level;
                            int i3 = tL_premium_boostsStatus.level;
                            if (i2 != i3) {
                                chat.level = i3;
                                g92Var2.getMessagesController().a4(g92Var2.x0, false);
                            }
                            Switch checkBox = g92Var2.N.getCheckBox();
                            if (tL_premium_boostsStatus.level < g92Var2.getMessagesController().k4.c2.f()) {
                                i = 2131232529;
                            } else {
                                i = 0;
                            }
                            checkBox.setIcon(i);
                            boolean z2 = z;
                            boolean[] zArr2 = zArr;
                            id idVar2 = idVar;
                            if (z2 && tL_premium_boostsStatus.level < g92Var2.getMessagesController().k4.c2.f()) {
                                g92Var2.N.setChecked(false);
                                zArr2[0] = false;
                                xg1 G02 = g92Var2.getMessagesController().G0();
                                long j3 = j2;
                                G02.b(j3, tL_premium_boostsStatus, new r4c(g92Var2, idVar2, tL_premium_boostsStatus, j3, (byte) 1));
                                return;
                            }
                            TLRPC.TL_channels_toggleAutotranslation tL_channels_toggleAutotranslation = new TLRPC.TL_channels_toggleAutotranslation();
                            g92Var2.getMessagesController();
                            tL_channels_toggleAutotranslation.channel = uc7.i1(g92Var2.x0);
                            tL_channels_toggleAutotranslation.enabled = z2;
                            g92Var2.N.setChecked(z2);
                            zArr2[0] = false;
                            idVar2.dismiss();
                            g92Var2.getConnectionsManager().sendRequest(tL_channels_toggleAutotranslation, new q81((byte) 2, g92Var2, z2), 64);
                        }
                    });
                    return;
                }
                return;
            case 3:
                uj3 uj3Var = (uj3) obj2;
                boolean hasUnread = ((of3) obj).getHasUnread();
                long j3 = this.c;
                if (hasUnread) {
                    uj3Var.y4(j3);
                } else {
                    uj3Var.getMessagesController().s3(j3, null, 0L);
                }
                uj3Var.finishPreviewFragment();
                return;
            case 4:
                lt5 lt5Var = (lt5) obj2;
                Context context = (Context) obj;
                zh6 zh6Var = lt5Var.Z1;
                if ((lt5Var.g2 != null || !zh6Var.i()) && (W = hl.W(context)) != null) {
                    if (lt5Var.g2 != null) {
                        ArrayList arrayList = new ArrayList();
                        for (int i = 0; i < zh6Var.m(); i++) {
                            arrayList.add(Long.valueOf(zh6Var.j(i)));
                        }
                        ru3 ru3Var = (ru3) lt5Var.g2.b;
                        ArrayList arrayList2 = ru3Var.e;
                        arrayList2.clear();
                        arrayList2.addAll(arrayList);
                        ru3Var.d0();
                        qu3 qu3Var = ru3Var.f;
                        if (qu3Var != null) {
                            qu3Var.a();
                        }
                        lt5Var.dismiss();
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(W);
                    String G = ob6.G(zh6Var.m(), "AddManyMembersAlertTitle", new Object[0]);
                    id idVar2 = alertDialog$Builder.a;
                    idVar2.S = G;
                    StringBuilder sb = new StringBuilder();
                    for (int i2 = 0; i2 < zh6Var.m(); i2++) {
                        TLRPC.User X1 = uc7.s1(lt5Var.a).X1(Long.valueOf(zh6Var.j(i2)));
                        if (X1 != null) {
                            if (sb.length() > 0) {
                                sb.append(", ");
                            }
                            sb.append("**");
                            sb.append(lv2.m(0, X1.first_name, X1.last_name));
                            sb.append("**");
                        }
                    }
                    TLRPC.Chat M0 = uc7.s1(lt5Var.a).M0(Long.valueOf(j));
                    if (zh6Var.m() > 5) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hl.S2(ob6.G(zh6Var.m(), "AddManyMembersAlertNamesText", M0.title)));
                        String format = String.format("%d", Integer.valueOf(zh6Var.m()));
                        int indexOf = TextUtils.indexOf(spannableStringBuilder, format);
                        if (indexOf >= 0) {
                            spannableStringBuilder.setSpan(new y7c(hl.o()), indexOf, format.length() + indexOf, 33);
                        }
                        idVar2.U = spannableStringBuilder;
                    } else {
                        idVar2.U = hl.S2(ob6.a0("AddMembersAlertNamesText", null, 2131754392, sb, M0.title));
                    }
                    alertDialog$Builder.j(ob6.M0(2131754479, null), new e05(lt5Var, (byte) 14));
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
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
                    pVar.f[0].setText(ob6.D0().q(this.c, false, true, true, pVar.D0.invoice.currency));
                }
                EditTextBoldCursor editTextBoldCursor = pVar.f[0];
                editTextBoldCursor.setSelection(editTextBoldCursor.length());
                return;
            default:
                wua wuaVar = (wua) obj2;
                String str = (String) obj;
                e Q = LaunchActivity.Q();
                if (Q != 0) {
                    ?? obj3 = new Object();
                    obj3.a = true;
                    nd9 nd9Var = new nd9(wuaVar.S1, str, this.c, wuaVar.J0);
                    nd9Var.f = new mra(wuaVar, (byte) 1);
                    Q.showAsSheet(nd9Var, obj3);
                    return;
                }
                return;
        }
    }
}
