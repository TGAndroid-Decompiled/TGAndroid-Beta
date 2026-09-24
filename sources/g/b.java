package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f9187a;
    public final c f9188b;

    public b(c cVar, f fVar) {
        this.f9188b = cVar;
        this.f9187a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f9188b;
        DialogInterface.OnClickListener onClickListener = cVar.f9216j;
        f fVar = this.f9187a;
        onClickListener.onClick(fVar.f9223b, i10);
        if (!cVar.f9218l) {
            fVar.f9223b.dismiss();
        }
    }
}
