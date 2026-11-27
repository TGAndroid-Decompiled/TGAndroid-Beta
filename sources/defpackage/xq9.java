package defpackage;

import android.text.InputFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class xq9 extends d6 {
    public final er9 a;

    public xq9(er9 er9Var) {
        this.a = er9Var;
    }

    @Override
    public final void b(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        final er9 er9Var = this.a;
        vc2 vc2Var = er9Var.c;
        er9Var.j();
        if (i == -1) {
            er9Var.onBackPressed();
        } else if (i == 1) {
            ir9.e(er9Var.a);
        } else if (i == 9) {
            er9Var.f();
        } else if (i == 10) {
            AlertDialog$Builder c = er9Var.c();
            id idVar = c.a;
            if (xc2.W(er9Var.d)) {
                i5 = 2131743105;
            } else {
                i5 = 2131742972;
            }
            idVar.S = ob6.M0(i5, null);
            TLRPC.Chat chat = er9Var.d;
            if (chat != null) {
                str = chat.title;
            } else {
                str = "";
            }
            final EditTextBoldCursor d = er9Var.d(c, str);
            d.setFilters(new InputFilter[]{new InputFilter.LengthFilter(40)});
            if (!TextUtils.isEmpty(vc2Var.b.title)) {
                d.setText(vc2Var.b.title);
                d.setSelection(d.length());
            }
            c.j(ob6.M0(2131745674, null), new fd() {
                @Override
                public final void w(id idVar2, int i6) {
                    byte b = r3;
                    EditTextBoldCursor editTextBoldCursor = d;
                    er9 er9Var2 = er9Var;
                    switch (b) {
                        case 0:
                            hl.t1(editTextBoldCursor);
                            er9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            er9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                return;
                            }
                            return;
                        default:
                            hl.t1(editTextBoldCursor);
                            er9Var2.c.z(editTextBoldCursor.getText().toString());
                            return;
                    }
                }
            });
            c.g(ob6.M0(2131752570, null), new bu3(d, (byte) 5));
            idVar.setOnShowListener(new ee4(d, (byte) 2));
            d.setOnEditorActionListener(new sq9(idVar, (byte) 0));
            er9.o(idVar);
        } else if (i == 11) {
            AlertDialog$Builder c2 = er9Var.c();
            id idVar2 = c2.a;
            if (vc2Var.w) {
                boolean z = vc2Var.b.record_video_active;
                idVar2.S = ob6.M0(2131742973, null);
                if (xc2.W(er9Var.d)) {
                    i4 = 2131743106;
                } else {
                    i4 = 2131742974;
                }
                idVar2.U = ob6.M0(i4, null);
                c2.j(ob6.M0(2131744498, null), new t41((byte) 13, er9Var, z));
                c2.g(ob6.M0(2131752570, null), null);
                er9.o(idVar2);
                return;
            }
            idVar2.S = ob6.M0(2131742978, null);
            idVar2.U = ob6.M0(2131742980, null);
            final EditTextBoldCursor d2 = er9Var.d(c2, ob6.M0(2131742995, null));
            c2.j(ob6.M0(2131744572, null), new fd() {
                @Override
                public final void w(id idVar22, int i6) {
                    byte b = r3;
                    EditTextBoldCursor editTextBoldCursor = d2;
                    er9 er9Var2 = er9Var;
                    switch (b) {
                        case 0:
                            hl.t1(editTextBoldCursor);
                            er9Var2.c.C(2, editTextBoldCursor.getText().toString());
                            er9Var2.J.j(100, 0L, null);
                            if (VoIPService.getSharedInstance() != null) {
                                VoIPService.getSharedInstance().playStartRecordSound();
                                return;
                            }
                            return;
                        default:
                            hl.t1(editTextBoldCursor);
                            er9Var2.c.z(editTextBoldCursor.getText().toString());
                            return;
                    }
                }
            });
            c2.g(ob6.M0(2131752570, null), new bu3(d2, (byte) 4));
            idVar2.setOnShowListener(new ee4(d2, (byte) 2));
            d2.setOnEditorActionListener(new sq9(idVar2, (byte) 0));
            er9.o(idVar2);
        } else if (i == 12) {
            AlertDialog$Builder c3 = er9Var.c();
            id idVar3 = c3.a;
            boolean W = xc2.W(er9Var.d);
            if (W) {
                i2 = 2131743134;
            } else {
                i2 = 2131743033;
            }
            idVar3.S = ob6.M0(i2, null);
            if (W) {
                i3 = 2131743135;
            } else {
                i3 = 2131743034;
            }
            idVar3.U = ob6.M0(i3, null);
            c3.j(ob6.M0(2131743035, null), new rq9(er9Var));
            c3.g(ob6.M0(2131752570, null), null);
            er9.o(idVar3);
            View c4 = idVar3.c(-1);
            if (c4 instanceof TextView) {
                ((TextView) c4).setTextColor(aob.w0(null, aob.mh, false));
            }
        }
    }
}
