package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final e f6944a;
    public final c f6945b;

    public b(c cVar, e eVar) {
        this.f6945b = cVar;
        this.f6944a = eVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i9, long j10) {
        c cVar = this.f6945b;
        DialogInterface.OnClickListener onClickListener = cVar.f6953j;
        e eVar = this.f6944a;
        onClickListener.onClick(eVar.f6958b, i9);
        if (!cVar.f6955l) {
            eVar.f6958b.dismiss();
        }
    }
}
