package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12925a;
    public final b f12926b;

    public a(b bVar, e eVar) {
        this.f12926b = bVar;
        this.f12925a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f12926b;
        e eVar = this.f12925a;
        ((DialogInterface.OnClickListener) bVar.f12940m).onClick(eVar.f12966b, i7);
        if (!bVar.f12930a) {
            eVar.f12966b.dismiss();
        }
    }
}
