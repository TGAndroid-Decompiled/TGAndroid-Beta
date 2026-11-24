package defpackage;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import org.telegram.ui.WallpapersListActivity;
public final class ftc implements f59 {
    public final byte a;
    public final Object b;

    public ftc(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void g(int i, View view) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((WallpapersListActivity) obj).D0(i);
                return;
            default:
                qtc qtcVar = (qtc) obj;
                String M0 = jb6.M0(2131753703, null);
                StringBuilder k = b10.k(M0, " ");
                String[] strArr = WallpapersListActivity.k0;
                k.append(jb6.M0(WallpapersListActivity.l0[i], strArr[i]));
                SpannableString spannableString = new SpannableString(k.toString());
                spannableString.setSpan(new ForegroundColorSpan(cmb.w0(null, cmb.A8, false)), M0.length(), spannableString.length(), 33);
                WallpapersListActivity wallpapersListActivity = qtcVar.F;
                wallpapersListActivity.K.setSearchFieldCaption(spannableString);
                wallpapersListActivity.K.setSearchFieldHint(null);
                wallpapersListActivity.K.P("", true);
                qtcVar.n = strArr[i];
                qtcVar.E("", true);
                return;
        }
    }
}
