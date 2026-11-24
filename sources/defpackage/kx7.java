package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProxyListActivity;
public final class kx7 extends c6 {
    public final byte a;
    public final Object b;
    public final d c;

    public kx7(d dVar, Object obj, byte b) {
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
                    gm.d3(new bl7(this, (a8) obj, (byte) 19), 150L);
                    passcodeActivity.h.setText("");
                    gl2[] gl2VarArr = passcodeActivity.n.f;
                    int length = gl2VarArr.length;
                    while (i4 < length) {
                        gl2VarArr[i4].setText("");
                        i4++;
                    }
                    passcodeActivity.y0();
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
                                fda fdaVar = (fda) obj2;
                                if (sb.length() > 0) {
                                    sb.append("\n\n");
                                }
                                sb.append(fdaVar.a.e());
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb.toString());
                            if (arrayList.size() > 1) {
                                i3 = 2131745191;
                            } else {
                                i3 = 2131745192;
                            }
                            Intent createChooser = Intent.createChooser(intent, jb6.M0(i3, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            s30 s30Var = proxyListActivity.a;
                            if (s30Var != null) {
                                s30Var.F();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    if (arrayList.size() > 1) {
                        i2 = 2131751447;
                    } else {
                        i2 = 2131751448;
                    }
                    String M0 = jb6.M0(i2, null);
                    he heVar = alertDialog$Builder.a;
                    heVar.U = M0;
                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                    heVar.S = jb6.M0(2131751446, null);
                    alertDialog$Builder.j(jb6.M0(2131751535, null), new h68(this, (byte) 19));
                    proxyListActivity.showDialog(heVar);
                    TextView textView = (TextView) heVar.c(-1);
                    if (textView != null) {
                        anb.X(textView, cmb.p7, null);
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
