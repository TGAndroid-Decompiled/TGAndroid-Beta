package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class od implements AdapterView.OnItemClickListener {
    public final sd a;
    public final pd b;

    public od(pd pdVar, sd sdVar) {
        this.b = pdVar;
        this.a = sdVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pd pdVar = this.b;
        sd sdVar = this.a;
        ((DialogInterface.OnClickListener) pdVar.m).onClick(sdVar.b, i);
        if (!pdVar.a) {
            sdVar.b.dismiss();
        }
    }
}
