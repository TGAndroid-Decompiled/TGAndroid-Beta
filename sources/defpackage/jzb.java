package defpackage;

import android.content.Context;
public final class jzb extends rzb {
    public final cib T1;

    public jzb(Context context, String str, String str2, CharSequence charSequence, cib cibVar) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T1 = cibVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        cib cibVar = this.T1;
        if (cibVar != null) {
            cibVar.run();
        }
    }
}
