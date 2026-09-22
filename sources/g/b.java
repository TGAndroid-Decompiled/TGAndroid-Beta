package g;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
public final class b implements AdapterView.OnItemClickListener {
    public final f f9202a;
    public final c f9203b;

    public b(c cVar, f fVar) {
        this.f9203b = cVar;
        this.f9202a = fVar;
    }

    @Override
    public final void onItemClick(AdapterView adapterView, View view, int i10, long j3) {
        c cVar = this.f9203b;
        DialogInterface.OnClickListener onClickListener = cVar.f9231j;
        f fVar = this.f9202a;
        onClickListener.onClick(fVar.f9238b, i10);
        if (!cVar.f9233l) {
            fVar.f9238b.dismiss();
        }
    }
}
