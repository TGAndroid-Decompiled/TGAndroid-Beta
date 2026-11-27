package defpackage;

import android.content.Context;
public final class j3c extends r3c {
    public final s8b T1;

    public j3c(Context context, String str, String str2, CharSequence charSequence, s8b s8bVar) {
        super(context, str, str2, charSequence, null, 0, false, null);
        this.T1 = s8bVar;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        s8b s8bVar = this.T1;
        if (s8bVar != null) {
            s8bVar.run();
        }
    }
}
