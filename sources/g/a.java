package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12917a;
    public final b f12918b;

    public a(b bVar, e eVar) {
        this.f12918b = bVar;
        this.f12917a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f12918b;
        e eVar = this.f12917a;
        ((DialogInterface.OnClickListener) bVar.f12932m).onClick(eVar.f12958b, i7);
        if (!bVar.f12922a) {
            eVar.f12958b.dismiss();
        }
    }
}
