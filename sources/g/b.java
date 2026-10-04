package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f10002a;
    public final c f10003b;

    public b(c cVar, f fVar) {
        this.f10003b = cVar;
        this.f10002a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f10003b;
        DialogInterface.OnClickListener onClickListener = cVar.f10033j;
        f fVar = this.f10002a;
        onClickListener.onClick(fVar.f10040b, i10);
        if (!cVar.f10035l) {
            fVar.f10040b.dismiss();
        }
    }
}
