package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProxyListActivity;
public final class iv7 extends c6 {
    public final byte a;
    public final Object b;
    public final d c;

    public iv7(d dVar, Object obj, byte b) {
        this.a = b;
        this.c = dVar;
        this.b = obj;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        int i4 = 0;
        d dVar = this.c;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) dVar;
                if (i == -1) {
                    passcodeActivity.finishFragment();
                    return;
                } else if (i == 1) {
                    passcodeActivity.E = !passcodeActivity.E;
                    gl.d3(new bj7(this, (a8) obj, (byte) 18), 150L);
                    passcodeActivity.h.setText("");
                    sj2[] sj2VarArr = passcodeActivity.n.f;
                    int length = sj2VarArr.length;
                    while (i4 < length) {
                        sj2VarArr[i4].setText("");
                        i4++;
                    }
                    passcodeActivity.x0();
                    return;
                } else {
                    return;
                }
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) dVar;
                ArrayList arrayList = proxyListActivity.F;
                if (i != -1) {
                    if (i != 0) {
                        if (i == 1) {
                            StringBuilder sb = new StringBuilder();
                            int size = arrayList.size();
                            while (i4 < size) {
                                Object obj2 = arrayList.get(i4);
                                i4++;
                                fba fbaVar = (fba) obj2;
                                if (sb.length() > 0) {
                                    sb.append("\n\n");
                                }
                                sb.append(fbaVar.a.e());
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb.toString());
                            if (arrayList.size() > 1) {
                                i3 = 2131745265;
                            } else {
                                i3 = 2131745266;
                            }
                            Intent createChooser = Intent.createChooser(intent, k96.M0(i3, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            s20 s20Var = proxyListActivity.a;
                            if (s20Var != null) {
                                s20Var.F();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    if (arrayList.size() > 1) {
                        i2 = 2131751498;
                    } else {
                        i2 = 2131751499;
                    }
                    String M0 = k96.M0(i2, null);
                    hd hdVar = alertDialog$Builder.a;
                    hdVar.U = M0;
                    alertDialog$Builder.g(k96.M0(2131752577, null), null);
                    hdVar.S = k96.M0(2131751497, null);
                    alertDialog$Builder.j(k96.M0(2131751586, null), new k88(this, (byte) 15));
                    proxyListActivity.showDialog(hdVar);
                    TextView textView = (TextView) hdVar.c(-1);
                    if (textView != null) {
                        zkb.X(textView, bkb.p7, null);
                        return;
                    }
                    return;
                } else if (arrayList.isEmpty()) {
                    proxyListActivity.finishFragment();
                    return;
                } else {
                    proxyListActivity.a.F();
                    return;
                }
        }
    }
}
