package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f9710a;
    public final b f9711b;

    public a(b bVar, e eVar) {
        this.f9711b = bVar;
        this.f9710a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f9711b;
        DialogInterface.OnClickListener onClickListener = bVar.f9739j;
        e eVar = this.f9710a;
        onClickListener.onClick(eVar.f9746b, i10);
        if (!bVar.f9741l) {
            eVar.f9746b.dismiss();
        }
    }
}
