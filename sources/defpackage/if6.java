package defpackage;

import android.os.Bundle;
import android.text.TextUtils;
import android.widget.TextView;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.SerializedData;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class if6 extends kla {
    public final mh6 E;
    public final EditTextBoldCursor a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final s09 e;
    public Bundle f;
    public boolean h;
    public TL_account.Password n;
    public String r;
    public String s;
    public String w;
    public String x;
    public final gt7 y;

    public if6(defpackage.mh6 r21, android.content.Context r22) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.if6.<init>(mh6, android.content.Context):void");
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final boolean d(boolean z) {
        this.h = false;
        this.E.y1(true, true);
        this.f = null;
        return true;
    }

    @Override
    public final void e() {
        this.h = false;
    }

    @Override
    public String getHeaderName() {
        return jb6.M0(2131748483, "LoginPassword");
    }

    @Override
    public final void h(String str) {
        if (!this.h && this.n != null) {
            String obj = this.a.getText().toString();
            if (obj.length() == 0) {
                if (this.E.getParentActivity() == null) {
                    return;
                }
                mh6.E1(this.y, true);
                return;
            }
            this.h = true;
            this.E.B1(0, true);
            Utilities.e.c(new k16(this, obj, (byte) 18));
        }
    }

    @Override
    public final void j() {
        gm.d3(new kg5(this, (byte) 27), mh6.A0);
    }

    @Override
    public final void k(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("passview_params");
        this.f = bundle2;
        if (bundle2 != null) {
            m(bundle2, true);
        }
        String string = bundle.getString("passview_code");
        if (string != null) {
            this.a.setText(string);
        }
    }

    @Override
    public final void l(Bundle bundle) {
        String obj = this.a.getText().toString();
        if (obj.length() != 0) {
            bundle.putString("passview_code", obj);
        }
        Bundle bundle2 = this.f;
        if (bundle2 != null) {
            bundle.putBundle("passview_params", bundle2);
        }
    }

    @Override
    public final void m(Bundle bundle, boolean z) {
        if (bundle == null) {
            return;
        }
        boolean isEmpty = bundle.isEmpty();
        EditTextBoldCursor editTextBoldCursor = this.a;
        if (isEmpty) {
            gm.t1(editTextBoldCursor);
            return;
        }
        editTextBoldCursor.setText("");
        this.f = bundle;
        String string = bundle.getString("password");
        this.r = string;
        if (string != null) {
            SerializedData serializedData = new SerializedData(Utilities.v(string));
            this.n = TL_account.Password.TLdeserialize(serializedData, serializedData.readInt32(false), false);
        }
        this.s = bundle.getString("phoneFormated");
        this.w = bundle.getString("phoneHash");
        this.x = bundle.getString("code");
        TL_account.Password password = this.n;
        if (password != null && !TextUtils.isEmpty(password.hint)) {
            editTextBoldCursor.setHint(this.n.hint);
        } else {
            editTextBoldCursor.setHint((CharSequence) null);
        }
    }

    @Override
    public final void updateColors() {
        int i = cmb.F6;
        this.d.setTextColor(cmb.w0(null, i, false));
        this.b.setTextColor(cmb.w0(null, cmb.C6, false));
        int w0 = cmb.w0(null, i, false);
        EditTextBoldCursor editTextBoldCursor = this.a;
        editTextBoldCursor.setTextColor(w0);
        editTextBoldCursor.setCursorColor(cmb.w0(null, i, false));
        editTextBoldCursor.setHintTextColor(cmb.w0(null, cmb.G6, false));
        this.c.setTextColor(cmb.w0(null, cmb.p6, false));
        this.y.f();
    }
}
