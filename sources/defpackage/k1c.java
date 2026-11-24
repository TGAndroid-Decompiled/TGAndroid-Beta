package defpackage;

import android.content.Context;
public final class k1c extends s1c {
    public final zcb T1;

    public k1c(Context context, String str, String str2, CharSequence charSequence, zcb zcbVar) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T1 = zcbVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        zcb zcbVar = this.T1;
        if (zcbVar != null) {
            zcbVar.run();
        }
    }
}
