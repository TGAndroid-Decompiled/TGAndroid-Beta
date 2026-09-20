package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f9205a;
    public final c f9206b;

    public b(c cVar, f fVar) {
        this.f9206b = cVar;
        this.f9205a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f9206b;
        DialogInterface.OnClickListener onClickListener = cVar.f9234j;
        f fVar = this.f9205a;
        onClickListener.onClick(fVar.f9241b, i10);
        if (!cVar.f9236l) {
            fVar.f9241b.dismiss();
        }
    }
}
