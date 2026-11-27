package defpackage;

import android.content.Context;
import android.content.Intent;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.PasscodeActivity;
import org.telegram.ui.ProxyListActivity;
public final class py7 extends d6 {
    public final byte a;
    public final Object b;
    public final e c;

    public py7(e eVar, Object obj, byte b) {
        this.a = b;
        this.c = eVar;
        this.b = obj;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        byte b = this.a;
        Object obj = this.b;
        int i4 = 0;
        e eVar = this.c;
        switch (b) {
            case 0:
                PasscodeActivity passcodeActivity = (PasscodeActivity) eVar;
                if (i == -1) {
                    passcodeActivity.finishFragment();
                    return;
                } else if (i == 1) {
                    passcodeActivity.E = !passcodeActivity.E;
                    hl.d3(new pl7(this, (b8) obj, (byte) 16), 150L);
                    passcodeActivity.h.setText("");
                    ok2[] ok2VarArr = passcodeActivity.n.f;
                    int length = ok2VarArr.length;
                    while (i4 < length) {
                        ok2VarArr[i4].setText("");
                        i4++;
                    }
                    passcodeActivity.y0();
                    return;
                } else {
                    return;
                }
            default:
                ProxyListActivity proxyListActivity = (ProxyListActivity) eVar;
                ArrayList arrayList = proxyListActivity.F;
                if (i != -1) {
                    if (i != 0) {
                        if (i == 1) {
                            StringBuilder sb = new StringBuilder();
                            int size = arrayList.size();
                            while (i4 < size) {
                                Object obj2 = arrayList.get(i4);
                                i4++;
                                wea weaVar = (wea) obj2;
                                if (sb.length() > 0) {
                                    sb.append("\n\n");
                                }
                                sb.append(weaVar.a.e());
                            }
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("text/plain");
                            intent.putExtra("android.intent.extra.TEXT", sb.toString());
                            if (arrayList.size() > 1) {
                                i3 = 2131745185;
                            } else {
                                i3 = 2131745186;
                            }
                            Intent createChooser = Intent.createChooser(intent, ob6.M0(i3, null));
                            createChooser.setFlags(268435456);
                            ((Context) obj).startActivity(createChooser);
                            t20 t20Var = proxyListActivity.a;
                            if (t20Var != null) {
                                t20Var.F();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(proxyListActivity.getParentActivity());
                    if (arrayList.size() > 1) {
                        i2 = 2131751475;
                    } else {
                        i2 = 2131751476;
                    }
                    String M0 = ob6.M0(i2, null);
                    id idVar = alertDialog$Builder.a;
                    idVar.U = M0;
                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                    idVar.S = ob6.M0(2131751474, null);
                    alertDialog$Builder.j(ob6.M0(2131751563, null), new jz7(this, (byte) 22));
                    proxyListActivity.showDialog(idVar);
                    TextView textView = (TextView) idVar.c(-1);
                    if (textView != null) {
                        yob.X(textView, aob.q7, null);
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
