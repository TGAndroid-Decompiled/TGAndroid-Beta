package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f13258a;
    public final b f13259b;

    public a(b bVar, e eVar) {
        this.f13259b = bVar;
        this.f13258a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f13259b;
        e eVar = this.f13258a;
        ((DialogInterface.OnClickListener) bVar.f13273m).onClick(eVar.f13299b, i7);
        if (!bVar.f13263a) {
            eVar.f13299b.dismiss();
        }
    }
}
