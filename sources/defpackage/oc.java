package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class oc implements AdapterView.OnItemClickListener {
    public final sc a;
    public final pc b;

    public oc(pc pcVar, sc scVar) {
        this.b = pcVar;
        this.a = scVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        pc pcVar = this.b;
        sc scVar = this.a;
        ((DialogInterface.OnClickListener) pcVar.m).onClick(scVar.b, i);
        if (!pcVar.a) {
            scVar.b.dismiss();
        }
    }
}
