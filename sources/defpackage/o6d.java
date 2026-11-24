package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Map;
import java.util.WeakHashMap;
public final class o6d extends Fragment implements c36 {
    public static final WeakHashMap b = new WeakHashMap();
    public final dd8 a = new dd8();

    @Override
    public final void a(String str, y26 y26Var) {
        this.a.a(str, y26Var);
    }

    @Override
    public final y26 b(Class cls, String str) {
        return (y26) cls.cast(((Map) this.a.b).get(str));
    }

    @Override
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.dump(str, fileDescriptor, printWriter, strArr);
        for (y26 y26Var : ((Map) this.a.b).values()) {
            y26Var.dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override
    public final Activity e() {
        return getActivity();
    }

    @Override
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        for (y26 y26Var : ((Map) this.a.b).values()) {
            y26Var.onActivityResult(i, i2, intent);
        }
    }

    @Override
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.a.b(bundle);
    }

    @Override
    public final void onDestroy() {
        super.onDestroy();
        dd8 dd8Var = this.a;
        dd8Var.a = (byte) 5;
        for (y26 y26Var : ((Map) dd8Var.b).values()) {
            y26Var.onDestroy();
        }
    }

    @Override
    public final void onResume() {
        super.onResume();
        dd8 dd8Var = this.a;
        dd8Var.a = (byte) 3;
        for (y26 y26Var : ((Map) dd8Var.b).values()) {
            y26Var.onResume();
        }
    }

    @Override
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        this.a.c(bundle);
    }

    @Override
    public final void onStart() {
        super.onStart();
        dd8 dd8Var = this.a;
        dd8Var.a = (byte) 2;
        for (y26 y26Var : ((Map) dd8Var.b).values()) {
            y26Var.onStart();
        }
    }

    @Override
    public final void onStop() {
        super.onStop();
        dd8 dd8Var = this.a;
        dd8Var.a = (byte) 4;
        for (y26 y26Var : ((Map) dd8Var.b).values()) {
            y26Var.onStop();
        }
    }
}
