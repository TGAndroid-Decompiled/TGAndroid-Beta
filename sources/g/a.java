package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f13260a;
    public final b f13261b;

    public a(b bVar, e eVar) {
        this.f13261b = bVar;
        this.f13260a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f13261b;
        e eVar = this.f13260a;
        ((DialogInterface.OnClickListener) bVar.f13275m).onClick(eVar.f13301b, i7);
        if (!bVar.f13265a) {
            eVar.f13301b.dismiss();
        }
    }
}
