package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f9199a;
    public final c f9200b;

    public b(c cVar, f fVar) {
        this.f9200b = cVar;
        this.f9199a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f9200b;
        DialogInterface.OnClickListener onClickListener = cVar.f9228j;
        f fVar = this.f9199a;
        onClickListener.onClick(fVar.f9235b, i10);
        if (!cVar.f9230l) {
            fVar.f9235b.dismiss();
        }
    }
}
