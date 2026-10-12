package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f9707a;
    public final b f9708b;

    public a(b bVar, e eVar) {
        this.f9708b = bVar;
        this.f9707a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f9708b;
        DialogInterface.OnClickListener onClickListener = bVar.f9736j;
        e eVar = this.f9707a;
        onClickListener.onClick(eVar.f9743b, i10);
        if (!bVar.f9738l) {
            eVar.f9743b.dismiss();
        }
    }
}
