package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class a implements AdapterView.OnItemClickListener {
    public final e f12081a;
    public final b f12082b;

    public a(b bVar, e eVar) {
        this.f12082b = bVar;
        this.f12081a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
        b bVar = this.f12082b;
        DialogInterface.OnClickListener onClickListener = bVar.f12110j;
        e eVar = this.f12081a;
        onClickListener.onClick(eVar.f12117b, i10);
        if (!bVar.f12112l) {
            eVar.f12117b.dismiss();
        }
    }
}
