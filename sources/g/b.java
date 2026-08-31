package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final e f6697a;
    public final c f6698b;

    public b(c cVar, e eVar) {
        this.f6698b = cVar;
        this.f6697a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        c cVar = this.f6698b;
        DialogInterface.OnClickListener onClickListener = cVar.f6706j;
        e eVar = this.f6697a;
        onClickListener.onClick(eVar.f6711b, i10);
        if (!cVar.f6708l) {
            eVar.f6711b.dismiss();
        }
    }
}
