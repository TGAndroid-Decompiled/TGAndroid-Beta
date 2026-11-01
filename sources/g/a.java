package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f7134a;
    public final b f7135b;

    public a(b bVar, e eVar) {
        this.f7135b = bVar;
        this.f7134a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f7135b;
        e eVar = this.f7134a;
        ((DialogInterface.OnClickListener) bVar.f7147m).onClick(eVar.f7172b, i10);
        if (!bVar.f7138a) {
            eVar.f7172b.dismiss();
        }
    }
}
