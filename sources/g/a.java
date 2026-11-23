package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12954a;
    public final b f12955b;

    public a(b bVar, e eVar) {
        this.f12955b = bVar;
        this.f12954a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f12955b;
        e eVar = this.f12954a;
        ((DialogInterface.OnClickListener) bVar.f12969m).onClick(eVar.f12995b, i7);
        if (!bVar.f12959a) {
            eVar.f12995b.dismiss();
        }
    }
}
