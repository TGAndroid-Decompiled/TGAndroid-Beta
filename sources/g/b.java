package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f10167a;
    public final c f10168b;

    public b(c cVar, f fVar) {
        this.f10168b = cVar;
        this.f10167a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f10168b;
        DialogInterface.OnClickListener onClickListener = cVar.f10198j;
        f fVar = this.f10167a;
        onClickListener.onClick(fVar.f10205b, i10);
        if (!cVar.f10200l) {
            fVar.f10205b.dismiss();
        }
    }
}
