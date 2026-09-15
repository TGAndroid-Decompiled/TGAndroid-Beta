package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f9200a;
    public final c f9201b;

    public b(c cVar, f fVar) {
        this.f9201b = cVar;
        this.f9200a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f9201b;
        DialogInterface.OnClickListener onClickListener = cVar.f9229j;
        f fVar = this.f9200a;
        onClickListener.onClick(fVar.f9236b, i10);
        if (!cVar.f9231l) {
            fVar.f9236b.dismiss();
        }
    }
}
