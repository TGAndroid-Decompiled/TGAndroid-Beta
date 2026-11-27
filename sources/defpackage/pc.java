package defpackage;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class pc implements AdapterView.OnItemClickListener {
    public final tc a;
    public final qc b;

    public pc(qc qcVar, tc tcVar) {
        this.b = qcVar;
        this.a = tcVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        qc qcVar = this.b;
        tc tcVar = this.a;
        ((DialogInterface.OnClickListener) qcVar.m).onClick(tcVar.b, i);
        if (!qcVar.a) {
            tcVar.b.dismiss();
        }
    }
}
