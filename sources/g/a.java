package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12951a;
    public final b f12952b;

    public a(b bVar, e eVar) {
        this.f12952b = bVar;
        this.f12951a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i7, long j3) {
        b bVar = this.f12952b;
        e eVar = this.f12951a;
        ((DialogInterface.OnClickListener) bVar.f12966m).onClick(eVar.f12992b, i7);
        if (!bVar.f12956a) {
            eVar.f12992b.dismiss();
        }
    }
}
