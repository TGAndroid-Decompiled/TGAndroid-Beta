package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f9188a;
    public final c f9189b;

    public b(c cVar, f fVar) {
        this.f9189b = cVar;
        this.f9188a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f9189b;
        DialogInterface.OnClickListener onClickListener = cVar.f9217j;
        f fVar = this.f9188a;
        onClickListener.onClick(fVar.f9224b, i10);
        if (!cVar.f9219l) {
            fVar.f9224b.dismiss();
        }
    }
}
