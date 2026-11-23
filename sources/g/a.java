package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12916a;
    public final b f12917b;

    public a(b bVar, e eVar) {
        this.f12917b = bVar;
        this.f12916a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f12917b;
        e eVar = this.f12916a;
        ((DialogInterface.OnClickListener) bVar.f12931m).onClick(eVar.f12957b, i7);
        if (!bVar.f12921a) {
            eVar.f12957b.dismiss();
        }
    }
}
