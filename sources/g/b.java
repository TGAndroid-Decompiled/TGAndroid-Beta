package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final e f6854a;
    public final c f6855b;

    public b(c cVar, e eVar) {
        this.f6855b = cVar;
        this.f6854a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        c cVar = this.f6855b;
        DialogInterface.OnClickListener onClickListener = cVar.f6863j;
        e eVar = this.f6854a;
        onClickListener.onClick(eVar.f6868b, i10);
        if (!cVar.f6865l) {
            eVar.f6868b.dismiss();
        }
    }
}
